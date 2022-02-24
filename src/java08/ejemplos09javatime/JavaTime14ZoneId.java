package java08.ejemplos09javatime;

import java.time.ZoneId;

public class JavaTime14ZoneId {

    public static void main(String[] args) {

        ZoneId zonaEuropaMadrid = ZoneId.systemDefault();
        System.out.println(zonaEuropaMadrid);

        ZoneId zonaEuropaParis = ZoneId.of("Europe/Paris");
        System.out.println(zonaEuropaParis);
    }
}
