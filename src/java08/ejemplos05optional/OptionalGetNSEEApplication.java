package java08.ejemplos05optional;

import java.util.Optional;

public class OptionalGetNSEEApplication {

  public static void main(String[] args){

    Optional<String> optional = Optional.ofNullable(null);
    String value = optional.get();
    System.out.println(value);


  }

}
