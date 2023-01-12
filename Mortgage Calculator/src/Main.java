import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    final static byte NUMBER_OF_MONTHS_IN_YEAR = 12;
    final static byte PERCENT = 100;
    public static void main (String[] args){
        int principal = (int) readNumber("Principal: ", 1_000, 1_000_000);
        float annualInterest = (float) readNumber("Annual interest: ", 1, 30);
        byte numberOfYears = (byte) readNumber("Number of years: ", 1, 30);

        printMorgage(principal, annualInterest, numberOfYears);

        printSchedule(principal, annualInterest, numberOfYears);
    }

    private static void printSchedule(int principal, float annualInterest, byte numberOfYears) {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("________________");
        for (short month = 1; month <= numberOfYears * NUMBER_OF_MONTHS_IN_YEAR; month++) {
            double balance = calculateRemaining(principal, annualInterest, numberOfYears, month);
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
        }
    }

    private static void printMorgage(int principal, float annualInterest, byte numberOfYears) {
        double mortgage = calculateMortgage(principal, annualInterest, numberOfYears);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("________");
        System.out.println("Monthly Payments: " + mortgageFormatted);
    }

    public static double readNumber(String prompt, double min, double max){
        Scanner scanner = new Scanner(System.in);
        double value;
        while (true) {
            System.out.print(prompt);
            value = scanner.nextInt();
            if (value >= min && value <= max)
                break;
            System.out.println("Enter value between " + min +" and " + max);
        }
        return value;
    }
    public static double calculateMortgage(int principal, float annualInterest, byte numberOfYears) {

        float monthlyInterest = annualInterest / PERCENT / NUMBER_OF_MONTHS_IN_YEAR;
        short numberOfPayments = (short) (numberOfYears * NUMBER_OF_MONTHS_IN_YEAR);
        double mortgage = (float) (principal *
                (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                /
                ((Math.pow(1 + monthlyInterest, numberOfPayments)) - 1));
        return mortgage;
    }
    public static double calculateRemaining(int principal, float annualInterest, byte numberOfYears, short numberOfPaymentsMade) {
        float monthlyInterest = annualInterest / PERCENT / NUMBER_OF_MONTHS_IN_YEAR;
        short numberOfPayments = (short) (numberOfYears * NUMBER_OF_MONTHS_IN_YEAR);

        double balance = principal *
                (Math.pow(1 + monthlyInterest, numberOfPayments) - Math.pow(1 + monthlyInterest, numberOfPaymentsMade))
                /
                ((Math.pow(1 + monthlyInterest, numberOfPayments)) - 1);

        return balance;
    }
}
