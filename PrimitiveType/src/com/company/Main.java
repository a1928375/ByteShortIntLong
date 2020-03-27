package com.company;

public class Main {

    public static void main(String[] args) {

        int e = 3;
        byte f = 6;
        short g = 8;

        //long h = 50000L + 10L*(e+f+g);
        long h = 50000 + 10*(e+f+g);

        //short i = 50000 + 10*(e+f+g);
        // => wrong

        short i = (short) (50000 + 10*(e+f+g));

        System.out.println(h);
    }
}
