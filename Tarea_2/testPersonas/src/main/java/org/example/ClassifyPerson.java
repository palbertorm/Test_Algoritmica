package org.example;

import java.util.Scanner;

public class ClassifyPerson {
    private Person[] people;

    public ClassifyPerson() {
        // TODO: Implement the correct number of people '50'
        this.people = new Person[50];
    }
    public void ChargePeople(){
        Scanner input = new Scanner(System.in);
        char gender;
        int age;
        for (int i = 0; i < people.length; i++) {
            System.out.println("type the gneder: " + ( i + 1 ) + " Male/female:");
            gender = input.next().toLowerCase().charAt(0);
            System.out.println(" intro the age of the person: " + ( i + 1 ) + ":");
            age = input.nextInt();
            people[i] = new Person(age, gender);
        }

    }
    public int calculateOlderAge() {
        int older = 0;
        for (Person person : people){
            if (person.isOlder()){
                older++;
            }
        }
        return older;
    }
    public int calculateYoungerAge() {
        return people.length - calculateOlderAge();

    }
    public int calculateMaleOlderAge() {
        int maleOlder = 0;
        for (Person person : people){
            if (person.isOlder() && person.isMale()){
                maleOlder++;
            }
        }
        return maleOlder;
    }
    public int calculateFemYoungerAge() {
        int femYounger = 0;
        for (Person person : people){
            if (!person.isMale() && !person.isOlder()){
                femYounger++;
            }
        }
        return femYounger;
    }
    public double calculatePercentOlders() {
        return (double) calculateOlderAge() / people.length * 100;
    }
    public double calculatePercentFemale(){
        int female = 0;
        for (Person person : people){
            if (!person.isMale()){
                female++;
            }
        }
        return (double) female / people.length *100;
    }
    public void showResults(){
        System.out.println(" people older than 18: " + calculateOlderAge());
        System.out.println(" people younger than 18: " + calculateYoungerAge());
        System.out.println(" male older than 18: " + calculateMaleOlderAge());
        System.out.println( " female less than 18: " + calculateFemYoungerAge());
        System.out.println(" percentage of people older than 18: " + String.format("%.2f",calculatePercentOlders()) + " % " );
        System.out.println(" percentage of female: " + String.format("%.2f",calculatePercentFemale()) + " % ");
    }
}
