package com.xat.pojo;

public class CheckOne implements Intercepter{
    @Override
    public String invoke(User user) {
        return "One";
    }
}
