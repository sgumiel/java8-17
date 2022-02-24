package java08.ejemplos05optional;

import java.util.Optional;

public class OptionalOfApplication {

  public static void main(String[] args){

    Optional<String> optional = Optional.of("Sergio");
    String sergio = optional.get();
    System.out.println(sergio);


  }

}
