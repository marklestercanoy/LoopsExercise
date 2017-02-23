package com.company;

public class Main {

    public static void main(String[] args) {

        int[] integer = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int i = 0;
        int count = 0;

// While Loop
        while (i < 10) {
            System.out.print(" " + "[" + integer[i] + "]");
            i++;
        }
        System.out.println("");

// Do-While Loop
        do {
            System.out.print(" " + "[" + integer[count] + "]");
            count++;

        } while (count < 10);

        System.out.println(" ");

// For Loop
        for (int counter = 0; counter < 10; counter++) {
            System.out.print(" " + "[" + integer[counter] + "]");
        }

        System.out.println(" ");

// Static Method
        StaticMethods.myMethod(6);

// Factorial
        StaticMethods.averageExerciseOne(5);

    }
}