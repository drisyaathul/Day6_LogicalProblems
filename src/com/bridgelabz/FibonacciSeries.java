package com.bridgelabz;
/*
Fibonacci series is a special type of series in which the next term is the sum of the
previous two terms. For example, if 0 and 1 are the two previous terms in a series, then
the next term will be 1(0+1).
 */

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the term: ");
        int term = scanner.nextInt();

        int number1 = 0 ;
        int number2 = 1;
        int number3;

        System.out.println("Fibonacci Series :- ");
        for (int i=0; i<term; i++) {
            number3 = number1 + number2;
            number1 = number2;
            number2 = number3;
            System.out.println(number3);
        }
     }
}
