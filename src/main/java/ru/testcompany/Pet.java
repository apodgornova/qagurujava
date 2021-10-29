package ru.testcompany;

public class Pet {

    String voice;
    String name;
    int weight;

    public void makeVoice() {
        System.out.println("I say " + voice);
    }

    public void sayWeight() {
        System.out.println("My weight is " + weight);
    }

    public void gettingFat() {
        weight = weight + 10;
    }

    public void sayName() {
        System.out.println("My name is " + name);
    }

}
