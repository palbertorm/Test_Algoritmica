package org.example;

public class Person {
    private int age;
    private char gender;

    public Person(int age, char gender) {
        this.age = age;
        this.gender = gender;
    }
    public boolean isOlder() {
        return age > 18;
    }
    public boolean isMale() {
        return gender == 'm';
    }
//
}
