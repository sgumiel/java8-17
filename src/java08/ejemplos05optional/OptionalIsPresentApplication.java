package java08.ejemplos05optional;

import java.util.Optional;

public class OptionalIsPresentApplication {

  public static void main(String[] args){

    Optional<Integer> optionalPresent = Optional.of(155);
    Optional<Integer> optionalEmpty = Optional.ofNullable(null);

    System.out.println(optionalPresent.isPresent());
    System.out.println(optionalEmpty.isPresent());


  }

}
