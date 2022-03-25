package com.oop.demo03;

import com.oop.demo03.Pet;

public class Application {
    public static void main(String[] args) {
        Pet dog = new Pet();
        dog.name="小磊";
        dog.age=4;


        System.out.println(dog.name);
        dog.shout();
        System.out.println(dog.age);
    }
}
