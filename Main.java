package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

       int MyVlaue= 100000;

       int MinValue = Integer.MIN_VALUE;
       int MaxValue = Integer.MAX_VALUE;

        System.out.println("Minimum Value: " + MinValue);
        System.out.println("Maximum Value: "+ MaxValue);

        System.out.println("Wrong Max: "+ (MaxValue+1));

        int MyTest = 2147483647 + 1;

        byte MinBValue = Byte.MIN_VALUE;
        byte MaxBValue = Byte.MAX_VALUE;

        System.out.println("Byte Min: "+ MinBValue);
        System.out.println("Byte Max: "+ MaxBValue);

        short MinSValue = Short.MIN_VALUE;
        short MaxSValue = Short.MAX_VALUE;

        System.out.println("Short Min: "+ MinSValue);
        System.out.println("Short Max: "+ MaxSValue);

        long MyLValue = 100L;
        long MinLValue = Long.MIN_VALUE;
        long MaxLValue = Long.MAX_VALUE;

        System.out.println("Long Min: "+ MinLValue);
        System.out.println("Long Max: "+ MaxLValue);

        long MyBigLValue = 10000000000000L;
        System.out.println(MyBigLValue);

        short Test = 32767;

        int a = MinValue/2;

        //byte b = MinBValue/2;

        // => change to
        byte bb = (byte) (MinBValue/2);

        //short c = MinSValue/2;

        short cc = (short) (MinSValue/2);

        //int d = MinLValue/2;

        long dd = MinLValue/2;


        System.out.println(a);
        //System.out.println(b);


    }
}
