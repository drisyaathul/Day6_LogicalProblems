package com.bridgelabz;

import java.util.Scanner;

/*
a. Desc -> Write a Stopwatch Program for measuring the time that elapses between
   the start and end clicks
b. I/P -> Start the Stopwatch and End the Stopwatch
c. Logic -> Measure the elapsed time between start and end
d. O/P -> Print the elapsed time.
*/
public class Stopwatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any number to Start : ");
        scanner.next();
        double start = 0;
        /*
            currentTimeMillis() method of System class returns current time in format of millisecond.
            Millisecond will be returned as unit of time.
         */
        start = System.currentTimeMillis();
        //System.out.println(start);

        System.out.print("Enter any number to stop : ");
        scanner.next();
        double stop = 0;

        stop = System.currentTimeMillis();
        //System.out.println(stop);

        double difference = stop - start;

        double elapsedTime = difference / 1000;

        System.out.println("Elapsed Time = "+elapsedTime);
    }
}
