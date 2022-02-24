package java08.ejemplos06lambdas;

import java.util.function.Predicate;

public class LambdaComoPredicadoApplication {

  public static void main(String[] args) {

    Predicate<Integer> mayor50 = (Integer numero) -> {return numero > 50; };

    boolean es38Mayor50 = mayor50.test(38);
    boolean es112Mayor50 = mayor50.test(112);
    boolean es50Mayor50 = mayor50.test(50);

    System.out.println("¿Es 38 mayor que 50? Respuesta: " + es38Mayor50);
    System.out.println("¿Es 112 mayor que 50? Respuesta: " + es112Mayor50);
    System.out.println("¿Es 50 mayor que 50? Respuesta: " + es50Mayor50);
  }

}
