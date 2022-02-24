package java08.ejemplos09javatime;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class JavaTime06LocalTime {

    public static void main(String[] args) {

        LocalTime ahora = LocalTime.now();
        System.out.println(ahora);

        LocalTime ahoraMas45Minutos = ahora.plusMinutes(35);
        System.out.println(ahoraMas45Minutos);

        LocalTime ahoraMas12Horas = ahora.plus(12, ChronoUnit.HOURS);
        System.out.println(ahoraMas12Horas);
    }
}
