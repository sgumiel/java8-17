package java08.ejemplos04nuevasinterfaces;

import java.util.function.Supplier;

public class ProducerApplication {

  public static void main(String[] args) {

    NumerosAleatorios numerosAleatorios = new NumerosAleatorios();

    Double primerNumeroAleatorio = numerosAleatorios.get();
    Double segundoNumeroAleatorio = numerosAleatorios.get();

    System.out.println("Primer numero aleatorio: " + primerNumeroAleatorio);
    System.out.println("Segundo numero aleatorio: " + segundoNumeroAleatorio);

  }

}

class NumerosAleatorios implements Supplier<Double> {

  @Override
  public Double get() {
    return Math.random();
  }
}
