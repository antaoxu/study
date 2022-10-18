package com.xat.pojo;

public class CheckTwo implements Intercepter{
    @Override
    public String invoke(User user) {
        return "Two";
    }
}
