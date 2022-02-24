package java08.ejemplos05optional;

import java.util.Optional;

public class OptionalOrElseApplication {

  public static void main(String[] args){

    Optional<String> optionalPresent = Optional.of("Pen");
    Optional<String> optionalEmpty = Optional.ofNullable(null);

    String pen = optionalPresent.orElse("Book");
    String car = optionalEmpty.orElse("Car");

    System.out.println(pen);
    System.out.println(car);

  }
}
