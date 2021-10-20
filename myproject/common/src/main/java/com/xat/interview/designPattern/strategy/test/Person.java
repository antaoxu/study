package com.xat.interview.designPattern.strategy.test;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * @author xuantao
 */
@Data
@Builder
public class Person implements Serializable {
    private  String name;
    private String sex;
    private int age;
    private String mobile;
    private String address;



}
