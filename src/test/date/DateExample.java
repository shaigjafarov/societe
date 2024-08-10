package test.date;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateExample {

    public static void main(String[] args) {
       Date indikiTarix= new Date();
        System.out.println(indikiTarix);


        LocalDate onlyDate= LocalDate.now().plusMonths(3);
        LocalTime onlyTime= LocalTime.now();
        LocalDateTime onlyDateTime= LocalDateTime.now();

//        SimpleDateFormat azFormat= new SimpleDateFormat("dd.MM.yyyy");
        DateTimeFormatter azFormat = DateTimeFormatter.ofPattern("dd.MM.yyyy hh:mm");

        System.out.println(onlyDateTime.format(azFormat));

//        System.out.println(onlyDate);
//        System.out.println(onlyTime);
//        System.out.println(onlyDateTime);


        System.out.println(LocalDate.of(2024, 8, 3));
        System.out.println(LocalDate.of(2024, Month.AUGUST, 3));
        System.out.println(LocalDateTime.of(onlyDate,onlyTime));


    }
}
