package java08.ejemplos09javatime;

import java.time.MonthDay;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class JavaTime08OffsetDateTime {

    public static void main(String[] args) {

        OffsetDateTime ahora = OffsetDateTime.now();
        System.out.println(ahora);
        System.out.println(ahora.atZoneSameInstant(ZoneId.of(ZoneId.SHORT_IDS.get("AGT"))));

        Integer month = ahora.getDayOfMonth();
        System.out.println(month);

        OffsetDateTime nextMont = ahora.plus(1, ChronoUnit.MONTHS);
        System.out.println(nextMont);


    }
}
