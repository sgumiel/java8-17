package java08.ejemplos09javatime;

import java.time.Clock;
import java.time.ZoneId;

public class JavaTime01Clock {

    public static void main(String[] args) {

        Clock relojDefaultZone = Clock.systemDefaultZone();

        System.out.println(relojDefaultZone);
        System.out.println(relojDefaultZone.instant());
        System.out.println(relojDefaultZone.instant().atZone(ZoneId.systemDefault()));

    }
}
