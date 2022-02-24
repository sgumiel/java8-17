package java08.ejemplos09javatime;

import java.time.DayOfWeek;
import java.time.YearMonth;
import java.time.ZonedDateTime;

public class JavaTime13ZoneDateTime {

    public static void main(String[] args) {

        ZonedDateTime dateTimeMadrid = ZonedDateTime.now();
        System.out.println(dateTimeMadrid);

        DayOfWeek dayOfWeek = dateTimeMadrid.getDayOfWeek();
        System.out.println(dayOfWeek);
    }
}
