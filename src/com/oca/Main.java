package com.oca;

public class Main {

    public static void main(String[] args) {

        // printing arguments
        System.out.println(args[0]);

        // if we provide only 1 argument we will obtain exception: ArrayIndexOutOfBoundsException;
        System.out.println(args[1]);
    }
}
