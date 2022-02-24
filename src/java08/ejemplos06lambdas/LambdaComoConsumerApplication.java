package java08.ejemplos06lambdas;

import java.util.function.Consumer;

public class LambdaComoConsumerApplication {

  public static void main(String[] args) {

    Consumer<String> imprimir = (String cadena) -> System.out.println(cadena);

    String miNombre = "Sergio";
    String pantalla = "Pantalla";

    imprimir.accept(miNombre);
    imprimir.accept(pantalla);

  }

}
