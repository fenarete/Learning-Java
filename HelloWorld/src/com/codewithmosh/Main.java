package com.codewithmosh;

import java.awt.*;
import java.text.NumberFormat;
import java.util.Scanner;


public class Main {
    public static void main (String[] args) {

        int principal = 0;
        Float interestRate = 0F;
        int period =0;

        //ask for Principal and captures it
      Scanner scanPrincipal = new Scanner(System.in);
      boolean exitWhilePrincipal;
      exitWhilePrincipal = false;
      while (exitWhilePrincipal == false) {
        System.out.print("Enter a number between 1,000 and 1,000,000: ");
        principal = scanPrincipal.nextInt();
        if (principal <= 1_000 || principal >= 1_000_000)
          exitWhilePrincipal = false;
        else exitWhilePrincipal = true;
      }

      //ask for Interest Rate and captures it
      Scanner scanInterestRate = new Scanner(System.in);
      boolean exitWhileInterestRate = false;
      while (exitWhileInterestRate == false) {
        System.out.print("Enter an interest rate value greater than 0 and lesser than 30: ");
        interestRate = scanInterestRate.nextFloat();
        if (interestRate <= 0 || interestRate >= 30)
          exitWhileInterestRate = false;
        else exitWhileInterestRate = true;
      }

      //converts Intrest Rate into handy number
      interestRate = interestRate / 12;
      interestRate = interestRate / 100;

      //ask for Period in Years
      Scanner scanPeriod = new Scanner(System.in);
      boolean exitWhilePeriod = false;
      while (exitWhilePeriod == false) {
        System.out.print("Period in Years /(1-30/): ");
        period = scanPeriod.nextInt();
        if (period < 1 || period > 30)
          exitWhilePeriod = false;
        else exitWhilePeriod = true;
      }

        //converts period into handy number
        period = period * 12;

        //Calculate mortgage
        double parentesis = Math.pow(1+interestRate,period); /* this is only to simplify next operation*/
        double mortgage = principal * ((interestRate * parentesis)/(parentesis-1));

        // Format mortgage number
        String result = NumberFormat.getCurrencyInstance().format(mortgage);

        //Print final result
        System.out.println("Your mortgage is " + result);
    }
}
