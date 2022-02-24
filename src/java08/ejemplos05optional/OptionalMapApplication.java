package java08.ejemplos05optional;

import java.util.Optional;
import java.util.function.Function;

public class OptionalMapApplication {

  public static void main(String[] args){

    Suma3 suma3 = new Suma3();
    DevuelveNull devuelveNull = new DevuelveNull();

    Optional<Integer> optional5 = Optional.of(5);
    Optional<Integer> optional8 = optional5.map(suma3);
    System.out.println(optional8);

    Optional<Integer> optional2 = Optional.ofNullable(null);
    Optional<Integer> opEmpty = optional2.map(suma3);
    System.out.println(opEmpty);

    Optional<Integer> optional3 = Optional.ofNullable(3);
    Optional<Integer> opEmpty2 = optional2.map(devuelveNull);
    System.out.println(opEmpty2);

  }

}

class DevuelveNull implements Function<Integer, Integer> {

  @Override
  public Integer apply(Integer integer) {
    return null;
  }
}

class Suma3 implements  Function<Integer, Integer> {

  @Override
  public Integer apply(Integer integer) {
    return integer + 3;
  }
}