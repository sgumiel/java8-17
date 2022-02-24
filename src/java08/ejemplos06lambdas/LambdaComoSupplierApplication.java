package java08.ejemplos06lambdas;

import java.util.function.Supplier;

public class LambdaComoSupplierApplication {

  public static void main(String[] args) {

    Supplier<Double> numeroAleatorio = () -> { return Math.random();} ;

    Double numero1 = numeroAleatorio.get();
    Double numero2 = numeroAleatorio.get();

    System.out.println("Numero 1: " + numero1);
    System.out.println("Numero 2: " + numero2);

  }

}
