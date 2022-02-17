package com.bridgelab.EmpWage4;

public class EmpWage {
    public static void main(String[] args) {
        int isFullTime = 1;
        double empcheck= Math.floor(Math.random() *10) % 2;
        if (empcheck == isFullTime)
            System.out.println("Employee is present");
        else
            System.out.println("Employee is Absent");
    }
}

