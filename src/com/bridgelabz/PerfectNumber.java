package com.bridgelabz;

import java.util.Scanner;

/*
a. Just like the Armstrong number, the Perfect Number is also a special type of
positive number. When the number is equal to the sum of its positive divisors
excluding the number, it is called a Perfect Number. For example, 28 is the perfect
number because when we sum the divisors of 28, it will result in the same number.
The divisors of 28 are 1, 2, 4, 7, and 14. So,
b. 28 = 1+2+4+7+14
c. 28 = 28
 */
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Perfect Number : ");
        int number = scanner.nextInt();

        int sum = 0;

        for (int i=1; i<number; i++) {
            if (number%i == 0){
                sum = sum + i;
                System.out.println(i);
            }
        }
        if (number == sum){
            System.out.println(number+" is a Perfect Number");
        } else
            System.out.println(number+" is not a perfect Number");

    }
}
