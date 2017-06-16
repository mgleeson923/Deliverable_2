package com.grandcircus;


import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        String userDate1;
        String userDate2;


        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter a date in the following format: MM/DD/YYYY");
        userDate1 = scnr.nextLine();

        if (!userDate1.matches("\\d\\d\\W\\d\\d\\W\\d\\d\\d\\d")) {
            System.out.println("Date formatted incorrectly. Please try again.");
            userDate1 = scnr.nextLine();
        }

        System.out.println("You entered " + userDate1);

        String date1 = userDate1;
        String[] dateParts1 = date1.split("/");
        String monthvalue1 = dateParts1[0];
        int month1 = Integer.valueOf(monthvalue1);
        String dayvalue1 = dateParts1[1];
        int day1 = Integer.valueOf(dayvalue1);
        String yearvalue1 = dateParts1[2];
        int year1 = Integer.valueOf(yearvalue1);

        LocalDate firstDate = null;
        firstDate = LocalDate.of(year1, Month.of(month1), day1);


        System.out.println("Enter a different date in the following format: MM/DD/YYYY");
        userDate2 = scnr.nextLine();


        if (!userDate2.matches("\\d\\d\\W\\d\\d\\W\\d\\d\\d\\d")) {
            System.out.println("Date formatted incorrectly. Please try again.");
            userDate1 = scnr.nextLine();
        }

        System.out.println("You entered " + userDate2);

        String date2 = userDate2;
        String[] dateParts2 = date2.split("/");
        String monthvalue2 = dateParts2[0];
        int month2 = Integer.valueOf(monthvalue2);
        String dayvalue2 = dateParts2[1];
        int day2 = Integer.valueOf(dayvalue2);
        String yearvalue2 = dateParts2[2];
        int year2 = Integer.valueOf(yearvalue2);

        LocalDate secondDate = null;
        secondDate = LocalDate.of(year2, Month.of(month2), day2);


        if (!userDate1.equals(userDate2)) {
            System.out.println("The difference between " + userDate1 + " and " + userDate2 + " is:");
            Period time = Period.between(firstDate, secondDate);
            System.out.println("Years: " + Math.abs(time.getYears()));
            System.out.println("Months: " + Math.abs(time.getMonths()));
            System.out.println("Days: " + Math.abs(time.getDays()));
        } else {
            System.out.println("Please enter two different dates.");
        }


    }
}
