package com.xat.pojo;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

public class Test {
    public static void main(String[] args) {
        String applyId = "12432424";
        EsbRequest<User> esbRequest = new EsbRequest<>();
        User user = new User();
        user.setId("ECIF");
        user.setAge(20);
        user.setName("hahah");
        esbRequest.setBody(user);
        //System.out.println(esbRequest.getBody().getId());
        //System.out.println(JSON.toJSONString(esbRequest.toString()));
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("request",esbRequest);
        jsonObject.put("response",applyId);
        System.out.println(jsonObject.toJSONString());
        System.out.println(jsonObject.get("request"));


        //System.out.println(esbRequest.toString());


    }

}
