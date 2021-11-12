package ru.testcompany;

public class Pet {

    public static String commonName = "Pet";

    String voice;
    String name;
    int weight;

    //constructors
    public Pet(int weight, String name) {
        this.weight = weight;
        this.name = name;
    }

    public Pet(int weight, String name, String voice) {
        this.weight = weight;
        this.name = name;
    }

    //getters and setters
    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

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
