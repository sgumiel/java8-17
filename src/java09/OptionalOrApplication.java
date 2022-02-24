package java09;

import java.util.Optional;

public class OptionalOrApplication {

  public static void main(String[] args) {

    Optional<String> optional1 = Optional.of("Transformador");
    Optional<String> transformador = optional1.or(() -> Optional.of("Cargador"));
    System.out.println(transformador);

    Optional<String> optional2 = Optional.ofNullable(null);
    Optional<String> cargador = optional2.or(() -> Optional.of("Cargador"));
    System.out.println(cargador);

  }
}