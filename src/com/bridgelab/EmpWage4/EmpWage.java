package com.bridgelab.EmpWage4;

public class EmpWage {
    public static void main(String[] args) {
        int isFullTime = 1;
        int EMP_RATE_PER_HOUR = 20;
        int empHrs = 0;
        int totalWage = 0;
        double empcheck= Math.floor(Math.random() *10) % 2;
        if (empcheck == isFullTime)
            empHrs = 8;
        totalWage = empHrs * EMP_RATE_PER_HOUR;
        System.out.println("Emp WAge: " + totalWage);
    }
}
