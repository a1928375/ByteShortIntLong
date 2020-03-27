package com.company;

public class Main {

    public static void main(String[] args) {

        float minF = Float.MIN_VALUE;
        float maxF = Float.MAX_VALUE;

        System.out.println(minF);
        System.out.println(maxF);

        double minD = Double.MIN_VALUE;
        double maxD = Double.MAX_VALUE;

        System.out.println(minD);
        System.out.println(maxD);

        int a = 5;
        float b = 5;
        double c = 5;

        //float bb = 5.2;
        double cc = 5.25;

        float bbb = 5.2f;
        float bbbb = (float) (5.2);

        int d = 5/3;
        float e = 5f/3f;
        double f = 5d/3d;

        System.out.println(d);
        System.out.println(e);
        System.out.println(f);

        double pound = 31d;
        double kilogram = pound * 0.45359237d;

        System.out.println("Converted kilogram = " + kilogram);

    }
}
