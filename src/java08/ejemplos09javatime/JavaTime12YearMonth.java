package java08.ejemplos09javatime;

import java.time.Year;
import java.time.YearMonth;

public class JavaTime12YearMonth {

    public static void main(String[] args) {

        YearMonth yearMonth202202 = YearMonth.now().now();
        System.out.println(yearMonth202202);

        YearMonth yearMonthBirth = YearMonth.of(1983,1);
        System.out.println(yearMonthBirth);

        YearMonth mayorEdad = yearMonthBirth.plusYears(18);
        System.out.println(mayorEdad);
    }
}
