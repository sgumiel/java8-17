package java10;

import java.util.Optional;

public class OpitionalSinValorOrElseThrowSupplierApplication {

  public static void main(String[] args) {

    var optional = Optional.ofNullable(null);
    var valor = optional.orElseThrow(() -> new OptionalEmptyException());
    System.out.println(valor);
  }

}

class OptionalEmptyException extends RuntimeException {
  OptionalEmptyException(){super("Custom Exception. No value present");}
}
