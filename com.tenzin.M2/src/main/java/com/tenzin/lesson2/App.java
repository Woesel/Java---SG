package com.tenzin.lesson2;

import java.util.Scanner;

/**
 *
 * @author Tenzin Woesel Jun 1, 2020
 */
public class App {

    public static void days() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a day of the week.");
        String userInput = sc.nextLine().toLowerCase();
        WeekDays d = null;

        switch (userInput) {
            case "monday":
                d = WeekDays.MONDAY;
                break;
            case "tuesday":
                d = WeekDays.TUESDAY;
                break;
            case "wednesday":
                d = WeekDays.WEDNESDAY;
                break;
            case "thursday":
                d = WeekDays.THURSDAY;
                break;
            case "friday":
                d = WeekDays.FRIDAY;
                break;
            default:
                break;
        }

        System.out.println(daysRemainingTillFriday(d));

    }

    public static String daysRemainingTillFriday(WeekDays day) {

        switch (day) {
            case MONDAY:
                return "There are 4 days till Friday.";
            case TUESDAY:
                return "There are 3 days till Friday.";
            case WEDNESDAY:
                return "There are 2 days till Friday.";
            case THURSDAY:
                return "There is 1 days till Friday.";
            case FRIDAY:
                return "It is Friday.";
            default:
                throw new UnsupportedOperationException();

        }

    }

    public static void main(String[] args) {

        days();

    }

}
