package com.company;

/**
 * Created by JPMC-PC27 on 20/02/2017.
 */
public class StaticMethods {

    public static int myMethod(int num) {
        int sum = 0;

        for (int number = 1; number <= 6; number++) {
            sum += num;

        }

        System.out.println(" Sum: " +"[" +sum+"]");
        return sum;

    }

    public static int averageExerciseOne(int n){
        int factor=1;

        for (int i=1; i<=n;i++){
            factor = factor*i;
        }
        System.out.println(" Factorial: " + factor);
        return factor;
    }
}

