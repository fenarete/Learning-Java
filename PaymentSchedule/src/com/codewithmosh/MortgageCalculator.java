package com.codewithmosh;

public class MortgageCalculator {
    public final static byte MONTHS_IN_YEAR = 12;
    public final static byte PERCENT = 100;
    private int principal;
    private double annualInterest;
    private byte years;

    public MortgageCalculator() {
        this.principal = principal;
        this.annualInterest = annualInterest;
        this.years = years;
    }
    public double calculateMortgage() {
        float monthlyInterestRate = (float) getMontlyInterest();
        short numberOfPayments = (short) getNumberOfPayments();
        double mortgage = principal * ((monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments)) /
                (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1));
        return mortgage;
    }


    public double calculateRemainingBalance(short paymentsMade) {
        float monthlyInterestRate = (float) getMontlyInterest();
        short numberOfPayments = (short) getNumberOfPayments();
        double balance = principal * ((Math.pow(1 + monthlyInterestRate, numberOfPayments) - Math.pow(1 + monthlyInterestRate, paymentsMade)) /
                (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1));
        return balance;
    }
    private double getMontlyInterest() {
        return annualInterest / PERCENT / MONTHS_IN_YEAR;
    }
    private int getNumberOfPayments() {
        return years * MONTHS_IN_YEAR;
    }
    public byte getYears(){
        return years;
    }
}
