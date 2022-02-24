package java10;

import java.util.Optional;

public class OpitionalSinValorOrElseThrowDefaultApplication {

  public static void main(String[] args) {

    var optional = Optional.ofNullable(null);
    var valor = optional.orElseThrow();
    System.out.println(valor);
  }

}
