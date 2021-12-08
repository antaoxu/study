package com.xat.interview.jvm;

/**
 * @author 淡漠
 */
public class ClassInitializing {
    public static void main(String[] args) {
        System.out.println(T.count);
    }
}

     class T{
         public static T t = new T();
         public static int count = 2;

        private T(){
            count++;
        }
    }

