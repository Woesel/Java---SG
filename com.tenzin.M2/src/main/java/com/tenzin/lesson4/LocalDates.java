package com.tenzin.lesson4;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;

/**
 *
 * @author Tenzin Woesel Jun 1, 2020
 */
public class LocalDates {

    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();// gets the present YYYY-MM-DD
        // System.out.println(ld);
        //ld = LocalDate.parse("2015-01-01"); //YYYY-MM-DD format
        //System.out.println(ld);
        //System.out.println(ld.atStartOfDay());
        //ld = LocalDate.parse("02/07/2010", DateTimeFormatter.ofPattern("MM/dd/yyyy"));
        // System.out.println(ld);
        ld = LocalDate.now();
        LocalDate past = ld.minusDays(8);
        System.out.println(past);

        Period diff = ld.until(past);
        System.out.println(diff);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        ld = LocalDate.parse("02/07/2010", formatter);
        String formatted = ld.format(formatter);
        System.out.println(formatted);
      

        formatted = ld.format(DateTimeFormatter.ofPattern("MM=dd=yyyy+=+=+="));
        System.out.println(formatted);

        formatted = past.format(
                DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)); //Prints the date format as DayName, MonthName day,YYYY
        System.out.println(formatted);
        

        Date legacyDate = new Date();
        ZonedDateTime zdt = ZonedDateTime.ofInstant(legacyDate.toInstant(), ZoneId.systemDefault());
        ld = zdt.toLocalDate();
        System.out.println(ld);

    }
}
