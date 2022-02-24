package java10;

import java.util.Optional;

public class OpitionalConValorOrElseThrowApplication {

  public static void main(String[] args) {

    var optional = Optional.of("ConValor");
    var valor = optional.orElseThrow();
    System.out.println(valor);

  }

}
