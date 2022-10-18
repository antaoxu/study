package com.xat.pojo;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author xuantao
 */
public class MyTest {

    private static String format = "yyyy-MM-dd";
    private static String format2 = "yyyy-MM-dd HH:mm:ss";


    public static void main(String[] args) {
        List<User> list = new ArrayList<>();
        User user = new User("1", "张三", 20);
        User user1 = new User("1", "张三", 26);
        User user2 = new User("1", "张三", 27);
        list.add(user);
        list.add(user1);
        list.add(user2);
        Map<String, List<User>> map = list.stream().collect(Collectors.groupingBy(User::getId));
        List<User> userList1 = map.get("1");
        User user4 = userList1.stream().filter(user3 -> "张三".equals(user3.getName())).findFirst().orElse(null);
        System.out.println(user4.toString());


        /*for (String s : list) {
            System.out.println(s);
        }
        System.out.println("=======================");
        List<String> result = null;
        result = list.stream().filter(fileName ->!Arrays.asList("qw","as").contains(fileName)).collect(Collectors.toList());
        for (String s : result) {
            System.out.println(s);
        }*/
       /* for (String s1 : newList) {
            System.out.println(s1);
        }*/

        //list.add(user);
        //list.add(user1);
        //list.add(user2);
        /*for (User user3 : list) {
            switch (user3.getId()){
                case "1":
                    sb.append("金额不一致："+user3.getAge()+"笔");
                    sb.append(",");
                    break;
                case "2":
                    sb.append("利率不一致："+user3.getAge()+"笔");
                    sb.append(",");
                    break;

                }
            }

        InputStream inputStream = new InputStream() {
            @Override
            public int read() throws IOException {
                return 0;
            }
        }


        try {
            testException();
            System.out.println("计算结果如下");
        }catch (Exception e){
            System.out.println("异常信息为========");
        }
    }

    private static void testException() throws Exception {

            int a = 10;
            int b = 0;
            int c = a/b;
            throw  new Exception("计算发生异常");
    }
*/
    }

}
