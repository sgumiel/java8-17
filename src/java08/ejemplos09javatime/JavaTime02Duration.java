package java08.ejemplos09javatime;

import java.time.Duration;

public class JavaTime02Duration {

    public static void main(String[] args) {

        Duration twoDays = Duration.ofDays(2);
        Duration thirtyMinutes = Duration.ofMinutes(30);

        Duration resta = twoDays.minus(thirtyMinutes);
        System.out.println(twoDays);
        System.out.println(thirtyMinutes);
        System.out.println(resta);

    }
}
