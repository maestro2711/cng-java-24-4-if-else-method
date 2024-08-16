package org.example;


public class Main {
    public static void main(String[] args) {
        // die il-else bediengung
        System.out.println("Erdwohner betritt den Raum");
        saysHelloToEarthPeople(true);
        System.out.println("Erdwohner betritt deb Raum");
        saysHelloToEarthPeople(true);
        int number = getInteger(7);


    }

    public static int getInteger(int number) {
        return 5;
    }

    public static void saysHelloToEarthPeople(boolean livingOnEarth) {

        System.out.printf("Hello ");
        int age = 18;


        if (livingOnEarth) {
            System.out.println("World");
            if (age >= 18) {
                System.out.println("welcome to the club");
            } else {
                System.out.println("bring your parent");
            }
        } else {
            System.out.println("Mars");
        }
    }
}