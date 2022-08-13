package com.sparta.week01_homework.models;


public class Person {
    // 멤버 변수 접근제어자 private
    private String name;
    private int age;
    private String address;
    private String job;
    // 명시적으로 public해줌
    // person클래스랑 controller클래스랑 다른 패키지에 있어서
    // 명시적으로 안해주면 디폴트로 됨
    public Person(){}
//   Person(String name, int age, String address, String job){
//        this.name = name;
//        this.age = age;
//        this.address = address;
//        this.job = job;
//    }

    //getter
    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public String getAddress(){
        return this.address;
    }

    public String getJob(){
        return this.job;
    }

    //setter
    public void setName(String name) {
        this.name = name;
    }

    public void seAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
