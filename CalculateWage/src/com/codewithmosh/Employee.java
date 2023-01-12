package com.codewithmosh;

public class Employee {
    private int baseSalary;
    private int hourlyRate;
    public int calculateWage(int extraHours) {
        return baseSalary + (hourlyRate * extraHours);
    }
    public void setBaseSalary (int baseSalary) {
        if (baseSalary <=0)
            throw new IllegalArgumentException("Base salary cannot be equal or less to 0");
        this.baseSalary = baseSalary;
    }
    private int getBaseSalary() {
        return baseSalary;
    }
    public void setHourlyRate (int hourlyRate) {
        if (hourlyRate <=0)
            throw new IllegalArgumentException("Hourly rate cannot be equal or less to 0");
        this.hourlyRate = hourlyRate;
    }
    private int getHourlyRate() {
        return hourlyRate;
    }
}
