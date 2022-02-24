package java08.ejemplos09javatime;

import java.time.Year;

public class JavaTime11Year {

    public static void main(String[] args) {

        Year year2022 = Year.now();
        System.out.println(year2022);

        Year yearBirth = Year.of(1983);
        System.out.println(yearBirth);

        boolean birthIsBeforeThisYear = year2022.isBefore(yearBirth);
        System.out.println(birthIsBeforeThisYear);
    }
}
