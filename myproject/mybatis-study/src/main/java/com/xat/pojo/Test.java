package com.xat.pojo;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.math.BigDecimal;
import java.util.UUID;

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
        System.out.println(a.add(tiaozheng));
    }
}






