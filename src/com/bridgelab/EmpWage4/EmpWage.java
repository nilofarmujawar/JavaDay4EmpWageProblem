package com.bridgelab.EmpWage4;

public class EmpWage {


    public static final int isPartTime =1;
    public static final int isFullTime = 2;
    public static final int empRatePerHour = 20;
    public static final int noOfWorkingDays = 2;

    public static void main(String[] args) {

        int empHrs = 0;
        int totalempwage = 0;
        int eWage = 0;
        int days = 20;
        
        for (int day = 0; day < noOfWorkingDays; days++) {

            double empcheck= Math.floor(Math.random() *10) % 3;

            switch ((int)empcheck){

                case isFullTime:
                    empHrs=8;
                    break;

                case isPartTime:
                    empHrs=4;
                    break;

                default:
                    empHrs=0;

            }
            eWage = empHrs * empRatePerHour;
            totalempwage += eWage;

            System.out.println("Emp WAge: " + eWage);
        }
        System.out.println("Total Emp WAge: " + totalempwage);
    }
}
