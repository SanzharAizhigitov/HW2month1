package org.example;

public class Plant {
    private int age;

    public Plant(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    public void printInfo(){
        System.out.println("Age: " + getAge());
    }
}
