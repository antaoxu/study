package com.xat.pojo;

import cn.hutool.core.date.DatePattern;
import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

public class Test {
    // 多层嵌套的 JSON 字符串，这里以一个示例字符串为例
    private static final String jsonStr = "{\n" +
            "  \"name\": \"John\",\n" +
            "  \"age\": 30,\n" +
            "  \"address\": {\n" +
            "    \"city\": \"New York\",\n" +
            "    \"zip\": \"10001\",\n" +
            "    \"location\": {\n" +
            "      \"lat\": 40.712776,\n" +
            "      \"lng\": -74.005974\n" +
            "    }\n" +
            "  },\n" +
            "  \"phoneNumbers\": [\n" +
            "    {\n" +
            "      \"type\": \"home\",\n" +
            "      \"number\": \"123-456-7890\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"type\": \"work\",\n" +
            "      \"number\": \"987-654-3210\"\n" +
            "    }\n" +
            "  ]\n" +
            "}";

    public static void main(String[] args) {
        User user = new User();
        user.setId("123");
        user.setName("哈哈哈");
        System.out.println(JSONObject.toJSONString(user));
        String s = "{\"age\":4,\"id\":\"1\"}";
        System.out.println(JSON.parseObject(s,User.class));
       /* List<User> userList = new ArrayList<>();
        User user1 = new User("2","20240401",1,new ArrayList<>());
        userList.add(user1);
        System.out.println(DateUtil.parse(user1.getName(), DatePattern.PURE_DATE_PATTERN));
        System.out.println(DateUtil.parse("20240402", DatePattern.PURE_DATE_PATTERN));
        User user2 = new User("1","20240407",1,new ArrayList<>());
        userList.add(user2);
        User user3 = new User("2","20240404",1,new ArrayList<>());
        userList.add(user3);
        User user4 = new User("1","20240405",1,new ArrayList<>());
        userList.add(user4);
        long t = System.currentTimeMillis();
        List<User> filterList = userList.stream().filter(user -> DateUtil.parse(user.getName(), DatePattern.PURE_DATE_PATTERN).compareTo(DateUtil.parse("20240408",DatePattern.PURE_DATE_PATTERN))<0).collect(Collectors.toList());
        System.out.println(JSONObject.toJSONString(filterList));


        List<User> collect = userList.stream().filter(user -> !filterList.contains(user)).collect(Collectors.toList());
        System.out.println(JSONObject.toJSONString(collect));
        Map<String, String> map = collect.stream().collect(Collectors.toMap(User::getName, User::getId, (k1, k2) -> k2));

        List<String> list = collect.stream().map(User::getName).collect(Collectors.toList());
        System.out.println(JSONObject.toJSONString(list));
        User user = User.builder().nameList(list).build();
        System.out.println(JSONObject.toJSONString(user));*/


      /*  BigDecimal decimal = new BigDecimal("1.0000");
        System.out.println(decimal.toString());
        System.out.println(decimal.stripTrailingZeros());
        System.out.println(decimal.stripTrailingZeros().toPlainString());
        // 将字符串解析为 JSONObject 对象
        JSONObject jsonObject = JSON.parseObject(jsonStr);

        // 获取 key 对应的值
        String cityName = jsonObject.getJSONObject("address").getString("city");
        //System.out.println("City name: " + cityName);

        double latitude = jsonObject.getJSONObject("address")
                .getJSONObject("location").getDouble("lat");
        double longitude = jsonObject.getJSONObject("address")
                .getJSONObject("location").getDouble("lng");
        //System.out.println("Latitude: " + latitude + ", Longitude: " + longitude);
        BigDecimal tiaozheng = BigDecimal.valueOf(-5.4);
        BigDecimal a = BigDecimal.valueOf(8);
        System.out.println(a.add(tiaozheng));*/
    }
}






