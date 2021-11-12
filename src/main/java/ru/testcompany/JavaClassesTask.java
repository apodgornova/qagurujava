package ru.testcompany;

public class JavaClassesTask {

    public static void main(String[] args) {

        Pet cat = new Pet(4, "Barsik");
        Pet dog = new Pet(6, "Stef");

        cat.setVoice("meow");
        dog.setVoice("woof");

        cat.sayName();
        cat.sayWeight();
        cat.makeVoice();

        dog.sayName();
        dog.sayWeight();
        dog.makeVoice();

        System.out.println("We are " + Pet.commonName + " class");
        cat.commonName = "Cat";
        System.out.println("We are " + Pet.commonName + " class now. Dogs too :)");

        cat.gettingFat(10);
        cat.sayName();
        System.out.println("I ate too much");
        cat.sayWeight();

    }

}
