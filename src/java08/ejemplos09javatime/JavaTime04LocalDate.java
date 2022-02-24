package java08.ejemplos09javatime;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class JavaTime04LocalDate {

    public static void main(String[] args) {

        LocalDate hoy = LocalDate.now();
        System.out.println(hoy);

        LocalDate manana = hoy.plusDays(1);
        System.out.println(manana);

        LocalDate fecha20220223 = LocalDate.of(2022,02,23);
        LocalDate fecha20220228 = fecha20220223.plus(5, ChronoUnit.DAYS);
        LocalDate fecha20220301 = fecha20220223.plus(6, ChronoUnit.DAYS);
        System.out.println(fecha20220228);
        System.out.println(fecha20220301);
    }
}
