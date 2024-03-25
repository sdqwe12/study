package org.example;

import java.time.LocalDate;
import java.time.Period;

public class Main4 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalDate xms = LocalDate.of(today.getYear(),12,25);
        System.out.println(xms);

        LocalDate eve = xms.minusDays(1);
        System.out.println(eve);

        Period left = Period.between(today,xms);
        System.out.println(left);

        System.out.println(left.getMonths()+"월"+left.getDays()+"일");

    }
}
