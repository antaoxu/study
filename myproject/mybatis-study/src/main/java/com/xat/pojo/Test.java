package com.xat.pojo;

public class Test {
    public static void main(String[] args) {
        EsbRequest<User> esbRequest = new EsbRequest<>();
        User user = new User();
        user.setId("ECIF");
        user.setAge(20);
        user.setName("hahah");
        esbRequest.setBody(user);
        System.out.println(esbRequest.getBody().getId());


    }

}
