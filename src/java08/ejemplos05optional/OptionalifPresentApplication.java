package java08.ejemplos05optional;

import java.util.Optional;
import java.util.function.Consumer;

public class OptionalifPresentApplication {

  public static void main(String[] args) {

    Imprimir imprimir = new Imprimir();
    Optional<String> optionalEmpty = Optional.ofNullable(null);
    optionalEmpty.ifPresent(imprimir);

    Optional<String> optionalCargador = Optional.ofNullable("Cargador");
    optionalCargador.ifPresent(imprimir);

    }

  }


class Imprimir implements Consumer<String> {

  @Override
  public void accept(String cadena) {
    System.out.println(cadena);

  }
}
