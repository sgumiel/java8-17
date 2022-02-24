package java08.ejemplos09javatime;

import java.time.ZoneOffset;

public class JavaTime15ZoneOffset {

    public static void main(String[] args) {

        ZoneOffset zoneOffset = ZoneOffset.UTC;
        System.out.println(zoneOffset);

        ZoneOffset zoneOffset10 = ZoneOffset.ofHours(10);
        System.out.println(zoneOffset10);

    }
}
