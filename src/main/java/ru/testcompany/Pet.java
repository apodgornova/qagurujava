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

    public int gettingFat(int somefat) {
        weight = weight + somefat;
        return weight;

    }

    public void sayName() {
        System.out.println("My name is " + name);
    }

}
