package java08.ejemplos05optional;

import java.util.Optional;

public class OptionalOfNPEApplication {

  public static void main(String[] args){

    Optional<String> optional = Optional.of(null);
    String sergio = optional.get();
    System.out.println(sergio);


  }

}
