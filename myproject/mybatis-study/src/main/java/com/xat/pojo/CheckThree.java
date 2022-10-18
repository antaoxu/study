package com.xat.pojo;

public class CheckThree implements Intercepter{
    @Override
    public String invoke(User user) {
        return "Three";
    }
}
