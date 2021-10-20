package com.xat.interview.designPattern.strategy.test;

public class ManageIntecerpter {

    private LoanIntercepter loanIntercepter;
    Person person = Person.builder().name("张三").build();
    ManageIntecerpter manageIntecerpter = new ManageIntecerpter();
}
