package java08.ejemplos04nuevasinterfaces;

import java.util.Optional;
import java.util.function.Consumer;

public class ConsumerApplication {

  public static void main(String[] args) {

    ImprimirBonito imprimirBonito = new ImprimirBonito();

    imprimirBonito.accept("Sergio");
    imprimirBonito.accept("Carmen");

  }
}

class ImprimirBonito implements Consumer<String> {

  @Override
  public void accept(String s) {
    System.out.println("**** " + s + " ****");
  }
}
