package com.codewithmosh;

import java.text.NumberFormat;

public class MortgageReport {

    public MortgageReport(MortgageCalculator calculator) {
        this.calculator = calculator;
    }

    private static MortgageCalculator calculator;

    public void printBalance() {
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");
        for (short month = 1; month <= (calculator.getYears() * MortgageCalculator.MONTHS_IN_YEAR); month++){
            double balance = calculator.calculateRemainingBalance(month);
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
        }
    }

    public void printMortgage() {
        double mortgage = calculator.calculateMortgage();
        String result = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly payments: " + result);
        System.out.println();
    }
}