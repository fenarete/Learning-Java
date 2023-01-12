package com.codewithmosh;


public class Main {

    public static void main(String[] args) {
        int principal = (int) Console.readNumber("Principal: ", 100_000, 1_000_000);
        byte years = (byte) Console.readNumber("Years: ", 1, 30);
        float annualInterest = (float) Console.readNumber("Annual interest rate: ", 1, 30);

        var calculator = new MortgageCalculator();
        var report = new MortgageReport(calculator);

        report.printMortgage();
        report.printBalance();
    }

}