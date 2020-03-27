package com.company;

public class Main {

    public static void main(String[] args) {

        String a = "This is string";
        System.out.println(a);

        a = a + ". Hi, All.";

        System.out.println(a);

        a = a + " \u0038";
        System.out.println("My string is: "+a);

    }
}
