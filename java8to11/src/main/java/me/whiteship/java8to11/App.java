package me.whiteship.java8to11;


import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class App {
    public static void main(String[] args) throws InterruptedException {
        LocalDate now = LocalDate.now();
        LocalDate heeweon = LocalDate.of(1994, 6, 26);
        Period between = Period.between(now, heeweon);
        System.out.println(between.getDays());

        Period until = now.until(heeweon);
        System.out.println(until);
        System.out.println(until.get(ChronoUnit.DAYS));

        LocalDateTime now1 = LocalDateTime.now();
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        System.out.println(now1.format(DateTimeFormatter.ISO_DATE));

        LocalDate parse = LocalDate.parse("06/26/1994", pattern);
        System.out.println(parse);

    }
}
