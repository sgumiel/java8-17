package java08.ejemplos09javatime;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class JavaTime09OffsetTime {

    public static void main(String[] args) {

        OffsetTime ahora = OffsetTime.now();
        System.out.println(ahora);

        Integer hour = ahora.getHour();
        System.out.println(hour);

        OffsetDateTime fecha20220101 = ahora.atDate(LocalDate.of(2022,1,1));
        System.out.println(fecha20220101);


    }
}
