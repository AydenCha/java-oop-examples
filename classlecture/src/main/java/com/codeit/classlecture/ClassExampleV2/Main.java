package com.codeit.classlecture.ClassExampleV2;

public class Main {
    public static void main(String[] args) {
        Person kim = new Person();
        kim.name = "김코딩";
        kim.age = 30;
        kim.gender = "male";
        kim.job = "Developer";

        Person coding = new Person();
        coding.name = "coding";
        coding.age = 22;
        coding.gender = "female";
        coding.job = "Student";

        System.out.println(kim);
        System.out.println(coding);

        kim.sleep();
    }
}
