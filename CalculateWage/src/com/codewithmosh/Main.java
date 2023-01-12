package com.codewithmosh;

public class Main {

    public static void main(String[] args) {
        var employee = new Employee();
        employee.setBaseSalary(50_000);
        employee.setHourlyRate(10);
        int wage = employee.calculateWage(20);
        System.out.println(wage);
    }

}

