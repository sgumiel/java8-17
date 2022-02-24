package java08.ejemplos09javatime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class JavaTime05LocalDateTime {

    public static void main(String[] args) {

        LocalDateTime hoy = LocalDateTime.now();
        System.out.println(hoy);
        System.out.println(hoy.atZone(ZoneId.systemDefault()));

        LocalDateTime haceMediaHora = hoy.minusMinutes(30);
        System.out.println(haceMediaHora);

        LocalDateTime navidad = LocalDateTime.of(2022,12,25,18,0,0, 0);
        LocalDateTime navidadNextDay = navidad.plus(1, ChronoUnit.DAYS);
        LocalDateTime diciembre1 = navidad.minus(Duration.ofDays(24));
        System.out.println(navidad);
        System.out.println(navidadNextDay);
        System.out.println(diciembre1);
    }
}
