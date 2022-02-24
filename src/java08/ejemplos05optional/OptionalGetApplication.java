package java08.ejemplos05optional;

import java.util.Optional;

public class OptionalGetApplication {

  public static void main(String[] args){

    Optional<String> optional = Optional.of("Mobile");
    String mobile = optional.get();
    System.out.println(mobile);


  }

}
