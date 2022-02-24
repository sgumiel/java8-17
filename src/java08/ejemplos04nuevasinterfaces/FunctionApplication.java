package java08.ejemplos04nuevasinterfaces;

import java.util.function.Function;


public class FunctionApplication {

  public static void main(String[] args) {

    ElevarAlCuadrado elevarAlCuadrado = new ElevarAlCuadrado();
    ContarCaracteres contarCaracteres = new ContarCaracteres();

    Integer nunmeroBase = 6;
    Integer resultadoElevarAlCuadro = elevarAlCuadrado.apply(nunmeroBase);

    String cadena = "Curso Java 8-17";
    Integer longitudCadena = contarCaracteres.apply(cadena);

    System.out.println("Si elevas al cuadrado el numero " + nunmeroBase + " te da como resultado " + resultadoElevarAlCuadro);
    System.out.println("La cadena " + cadena + " tiene una longitud de " + longitudCadena);
  }

}

class ContarCaracteres implements Function<String, Integer> {

  @Override
  public Integer apply(String cadena) {
    return cadena.length();
  }
}

class ElevarAlCuadrado implements Function<Integer, Integer> {

  @Override
  public Integer apply(Integer numero) {
    return numero * numero;
  }
}