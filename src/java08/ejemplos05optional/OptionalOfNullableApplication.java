package java08.ejemplos05optional;

import java.util.Optional;

public class OptionalOfNullableApplication {

  public static void main(String[] args){

    Optional<String> optionalConValor = Optional.ofNullable("Sergio");
    Optional<String> optionalSinValor = Optional.ofNullable(null);

    System.out.println(optionalConValor);
    System.out.println(optionalSinValor);


  }

}
