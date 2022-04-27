package com.xat.interview.base;

public class Animal {
    private String name;
    private int age;
    private int num;

    public Animal(String name, int age,int num) {
        this.name = name;
        this.age = age;
        this.num = num;
    }
    public Animal(){

    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", num=" + num +
                '}';
    }

    public static void m(){
        Animal animal = new Animal();
        animal.setAge(1);
        animal.setNum(animal.getAge());
        System.out.println(animal.toString());
    }
    public void sayHello(String name) {
        System.out.println(this.name + "在说话");
    }

    public static void main(String[] args) {
        m();
    }
}
