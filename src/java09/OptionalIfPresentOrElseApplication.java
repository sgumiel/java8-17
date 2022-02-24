package java09;

import java.util.Optional;

public class OptionalIfPresentOrElseApplication {

  public static void main(String[] args) {

    Optional<Integer> numeroOp = Optional.of(17);
    numeroOp.ifPresentOrElse(
        (numero) -> System.out.println("Tiene valor: " + numero),
        () -> System.out.println("El optional es vacio"));

    Optional<String> optionalVacio = Optional.ofNullable(null);
    optionalVacio.ifPresentOrElse(
        (ciudad) -> System.out.println("Tiene valor: " + ciudad),
        () -> System.out.println("No tiene valor"));
  }

}
