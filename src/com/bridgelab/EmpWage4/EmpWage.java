package com.bridgelab.EmpWage4;

public class EmpWage {

    public static final int isPartTime = 2;
    public static final int isFullTime = 1;
    public static final int empRatePerHour = 20;
    public static final int noOfWorkingDays = 2;
    public static final int maxHrsInMonth = 10;

    public static void main(String[] args) {

        int empHrs = 0;
        int totalWage = 0;
        int eWage = 0;
        int totalWorkingDays = 0;
        int totalEmpHrs = 0;

        while (totalEmpHrs <= maxHrsInMonth && totalWorkingDays < noOfWorkingDays) {

            totalWorkingDays++ ;

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

            totalEmpHrs = totalEmpHrs +  empHrs;

            eWage = empHrs * empRatePerHour ;

            totalWage += eWage;
            
            System.out.println("Emp WAge: " + eWage);
        }
        System.out.println("Total Emp WAge: " + totalWage);
    }
}
