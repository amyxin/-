package com.example.demo.test;

public class Main {
    public static void main(String[] args) {
        Student a=new Student("test",12);
        Student b;
        b=a;
        System.out.println(b.getAge()+":"+b.getName());
        System.out.println(a.getAge()+":"+a.getName());
        a.setAge(14);
        System.out.println(b.getAge()+":"+b.getName());
        System.out.println(a.getAge()+":"+a.getName());
    }
}
