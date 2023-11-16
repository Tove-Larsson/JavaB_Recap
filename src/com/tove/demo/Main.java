package com.tove.demo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // lektion 1 static

        /* Counter counterA = new Counter();
        Counter counterB = new Counter();
        Counter counterC = new Counter();

        counterA.increaseCount();
        counterB.increaseCount();
        counterC.increaseCount();

        // Static method does not require instantiation
        Counter.sayHello();

    } */

        // Lektion 2 List arraylist och linkedlist

        /*
        List<Integer> scoreList = new ArrayList<>();
        List<String> test2 = new LinkedList<>();


        scoreList.add(500);
        System.out.println(scoreList.get(0));
        scoreList.set(0, 1000);
        System.out.println(scoreList.get(0));
        scoreList.remove(0);
        System.out.println(scoreList);

         */


        // Lektion 3 Menu & switches

        /* int age = 15;
        if(age >= 18) {
            System.out.println("True");
        } else if (age >= 16){
            System.out.println("false");
        }

        switch(age) {
            case 1:
                System.out.println("You are a baby");
                break;
            case 15:
                System.out.println("You are 15");
                break;
        }

        int dayOfTheWeek = 5;

        switch (dayOfTheWeek) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            default -> System.out.println("Weekend");


        }

         */


        // Lektion 4 OOP

        /*
        AccessModTest accessModTest = new AccessModTest();

        accessModTest.testProtected();
        accessModTest.testNoMod();
        accessModTest.testPublic();

        Student benny = new Student();

        benny.setName("Benny");
        benny.setAge(18);
        benny.setHangry(true);
        benny.setGrade('A');

        System.out.println(benny);

        benny.setScore(50);

        benny.setScore(benny.getScore() - 5);
        System.out.println(benny.getScore());


        benny.setBook(
                new Book(300, "Benny", "Becoming a wizard")
        );


        System.out.println(benny.getBook());

         */

        // Lektion 5 Polymorphism

        List<String> test = new ArrayList<>();



        // Lektion 8 secure by design

        final String name;

        name = "Benny";

    }
}
