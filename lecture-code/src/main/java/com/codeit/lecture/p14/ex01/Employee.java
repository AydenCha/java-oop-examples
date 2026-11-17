package com.codeit.lecture.p14.ex01;

class Address {
    String city, country;

    public Address(String city, String country) {
        this.city = city;
        this.country = country;
    }

    public String getCity() {
        return this.city;
    }
}

public class Employee {
    int id;
    String name;
    Address address; // Address를 포함함

    public Employee(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    void showInfo() {
        System.out.println(id + " " + name);
        System.out.println(address.city + " " + address.country);
    }

    public static void main(String[] args) {
        Address a1 = new Address("서울", "한국");
        Employee e1 = new Employee(1, "김코딩", a1);
        e1.showInfo();
    }
}
