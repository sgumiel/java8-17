package java08.ejemplos05optional;

import java.util.Optional;
import java.util.function.Supplier;

public class OptionalOrElseGetApplication {

  public static void main(String[] args){

    CadenaNaranjaSupplier cadenaNaranjaSupplier = new CadenaNaranjaSupplier();

    Optional<String> optional = Optional.ofNullable(null);
    String naranja = optional.orElseGet(cadenaNaranjaSupplier);
    System.out.println(naranja);

  }
}
class CadenaNaranjaSupplier implements Supplier<String> {

  @Override
  public String get() {
    return "Naranja";
  }
}
