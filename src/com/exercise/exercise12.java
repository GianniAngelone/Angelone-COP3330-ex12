/*
 *  UCF COP3330 Fall 2021 Assignment 12 Solution
 *  Copyright 2021 Gianni Angelone
 */
package com.exercise;
import java.util.Scanner;
public class exercise12{
    public static void main(String[] args) {
        double interest;
        Scanner scan = new Scanner(System.in);
        //Here we first take in the input from a user
        System.out.print("Enter the principal: ");
        double principal = scan.nextDouble();;
        System.out.print("Enter the rate of interest: ");
        interest = scan.nextDouble();
        System.out.print("Enter the number of years: ");
        int years = scan.nextInt();
        //Here we divide the interest by 100, as it was entered as ex (4.2) instead of the needed (.042)
        double newInterest = interest/100;
        //Here we use the mathematical equation given to us to determine our total investment.
        double simpleInterest = principal * (1 + (newInterest*years));
        double roundUpCents = Math.round(simpleInterest * 100.0) / 100.0;
        //Now we print our results to the screen after calculating.
        System.out.println("After " + years + " years at " + interest + "%, the investment will be worth $" + roundUpCents);
    }
}
