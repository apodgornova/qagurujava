package ru.testcompany;

public class JavaClassesTask {

    public static void main(String[] args) {

        Pet cat = new Pet(4, "Barsik");
        Pet.Body catsBody = new Pet.Body();
        Pet dog = new Pet(6, "Stef");
        Pet.Body dogsBody = new Pet.Body();

        cat.setVoice("meow");
        dog.setVoice("woof");

        cat.sayName();
        cat.sayWeight();
        cat.makeVoice();
        catsBody.showMyBodyParts();

        dog.sayName();
        dog.sayWeight();
        dog.makeVoice();
        dogsBody.showMyBodyParts();

        //static variable change
        System.out.println("We are " + Pet.commonName + " class");
        cat.commonName = "Cat";
        System.out.println("We are " + Pet.commonName + " class now. Dogs too :)");

        cat.gettingFat(10);
        cat.sayName();
        System.out.println("I ate too much");
        cat.sayWeight();

    }

}
