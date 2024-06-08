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
        String s = "b";
        String b = "sdfds";
        if (s.length() == b.length()){
            System.out.println("hahhah");
        }
        System.out.println(s.charAt(0) - 97);
    }
}






