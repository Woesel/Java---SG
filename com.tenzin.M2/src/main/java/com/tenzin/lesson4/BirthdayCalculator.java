package com.tenzin.lesson4;

import com.tenzin.classroster.ui.UserIO;
import com.tenzin.classroster.ui.UserIOConsoleImpl;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author Tenzin Woesel Jun 1, 2020
 */
public class BirthdayCalculator {

    public static void main(String[] args) {

        UserIO io = new UserIOConsoleImpl();

        io.print("Welcome to the Magical BirthDAY Calculator!");

        String userInput = io.readString("What is your date of birth?");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate ld = LocalDate.parse(userInput, formatter);
        //System.out.println(ld);
        System.out.println("That means you were born on a " + ld.getDayOfWeek() + "!");

        //Lets calculate the birthday for this year
        LocalDate today = LocalDate.now();
        int currentYear = today.getYear();
        int month = ld.getMonthValue();
        int day = ld.getDayOfMonth();

        LocalDate bdayThisYear = LocalDate.of(currentYear, month, day);
        //Period diff = LocalDate.now().until(bdayThisYear);
        long daysUntil;
        if (bdayThisYear.isBefore(today)) {
            daysUntil = ChronoUnit.DAYS.between(today, bdayThisYear.plusYears(1));

        } else {
            daysUntil = ChronoUnit.DAYS.between(today, bdayThisYear);
        }

        int age = bdayThisYear.getYear() - ld.getYear();

        System.out.println("This year it falls on " + bdayThisYear.getDayOfWeek());
        System.out.println("Since today is " + LocalDate.now() + ", there's only " + daysUntil + " more days until the next one!");
        System.out.println("Bet yer excited to be turning " + age + "!");

    }
}
