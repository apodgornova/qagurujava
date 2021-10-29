package ru.testcompany;

public class JavaClassesTask {

    public static void main(String[] args) {

        Pet cat = new Pet();
        Pet dog = new Pet();

        cat.name = "Barsik";
        cat.weight = 4;
        cat.voice = "meow";

        dog.name = "Stef";
        dog.weight = 6;
        dog.voice = "woof";

        cat.sayName();
        cat.sayWeight();
        cat.makeVoice();

        dog.sayName();
        dog.sayWeight();
        dog.makeVoice();

        cat.gettingFat();
        cat.sayName();
        System.out.println("I'm ate too much");
        cat.sayWeight();

    }

}
