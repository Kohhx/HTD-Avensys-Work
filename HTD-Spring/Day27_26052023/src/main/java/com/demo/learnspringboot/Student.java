package com.demo.learnspringboot;

public class Student {
    private int id;
    private String name;
    private int age;
    private String city;

    public Student(int id, String name, int age, String country) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.city = country;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getCountry() {
        return city;
    }

    public void setCountry(String country) {
        this.city = country;
    }
}
