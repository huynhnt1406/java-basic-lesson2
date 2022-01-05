package com.company;

public class Student {
    String name;
    int age;
    String country;
    String district;
    int streetNo;
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
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public int getStreetNo() {
        return streetNo;
    }

    public void setStreetNo(int streetNo) {
        this.streetNo = streetNo;
    }
    public Student(String name,int age, int streetNo , String country, String district){
        this.name = name;
        this.age =age;
        this.streetNo = streetNo;
        this.country = country;
        this.district = district;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", country='" + country + '\'' +
                ", district='" + district + '\'' +
                ", streetNo=" + streetNo +
                '}';
    }

    public void getInfo(){
        System.out.println(toString());
    }
}
