package java08.ejemplos09javatime;

import java.time.Period;

public class JavaTime10Period {

    public static void main(String[] args) {

        Period unAnio = Period.ofYears(1);
        System.out.println(unAnio);

        Period twoWeeks = Period.ofWeeks(2);
        System.out.println(twoWeeks);

        Period addition = unAnio.plus(twoWeeks);
        System.out.println(addition);

    }
}
