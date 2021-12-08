package com.xat.interview.jvm;


import java.io.*;

/**
 * @author 淡漠
 * 自定义类加载器
 */
public class ClassLoaderDefine extends ClassLoader {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        //创建classLoader对象，调用父类ClassLoader的loadClass方法，需传入要加载的类的全限定名
        ClassLoader loader = new ClassLoaderDefine();
        Class clazz = loader.loadClass("com.xat.simple.isolate.controller.ControllerTest");
        //加载到内存后可通过反射创建实例
        Object instance = clazz.newInstance();
        /**
         * 可以发现com.xat.simple.isolate.controller.ControllerTest类是由自定义加载器
         * ClassLoaderDefine加载到内存的，因为该类不在当前项目的classpath下
         * 而loader.getClass()也就是ClassLoaderDefine类，在该项目的classpath下，所以是由
         * sun.misc.Launcher$AppClassLoader加载器加载到内存的
         */
        System.out.println(clazz.getClassLoader());
        System.out.println(loader.getClass().getClassLoader());
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        File file = new File("D:\\openSourceProgram\\sofaboot-study\\sofaboot-simple-isolate\\sofaboot-run\\target\\classes",name.replace(".","/").concat(".class"));
        try {
            FileInputStream fis = new FileInputStream(file);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            int b = 0;
            while ((b = fis.read())!= -1){
                bos.write(b);
            }
            byte[] bytes = bos.toByteArray();
            bos.close();
            fis.close();
            return super.defineClass(name,bytes,0,bytes.length);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return super.findClass(name);
    }
}
