package java08.ejemplos09javatime;

import java.time.Duration;
import java.time.Instant;
import java.time.ZoneId;
import java.time.temporal.TemporalAmount;

public class JavaTime03Instant {

    public static void main(String[] args) {

        Instant ahora = Instant.now();

        System.out.println(ahora);
        System.out.println(ahora.atZone(ZoneId.systemDefault()));
        System.out.println(ahora.atZone(ZoneId.of(ZoneId.SHORT_IDS.get("CST"))));

        TemporalAmount sevenHoras = Duration.ofHours(7);
        Instant ahoraMas7Horas = ahora.plus(sevenHoras); // Inmutable
        System.out.println(ahora); //Inmutable
        System.out.println(ahoraMas7Horas);


    }
}
