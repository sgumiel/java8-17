package java08.ejemplos08stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamFilterApplication {

  public static void main(String[] args) {

    FiltrarPares filtrarPares = new FiltrarPares();

    List<Integer> listaDeNumeros = Arrays.asList(new Integer[] {1, 3, 4, 5, 12, 21, 40});

    List<Integer> listaDeNumerosParesConFunction = listaDeNumeros.stream()
        .filter(filtrarPares)
        .collect(Collectors.toList());

    System.out.println(listaDeNumerosParesConFunction);

    List<Integer> listaDeNumerosParesConLambdas = listaDeNumeros.stream()
        .filter((numero) -> numero % 2 == 0)
        .collect(Collectors.toList());

    System.out.println(listaDeNumerosParesConLambdas);

    List<Numero> listaNumeros = Arrays.asList(new Numero[] {new Numero(2), new Numero(31), new Numero(40), new Numero(56), new Numero(89)});

    List<Numero> listaDeNumerosParesConReferenciasDeMetodo = listaNumeros.stream()
        .filter(Numero::isPar)
        .collect(Collectors.toList());

    System.out.println(listaDeNumerosParesConReferenciasDeMetodo);

  }

}

class FiltrarPares implements Predicate<Integer> {

  @Override
  public boolean test(Integer integer) {
    return integer % 2 == 0;
  }
}

class Numero {

  private Integer numero;

  Numero(Integer numero) {
    this.numero = numero;
  }

  public Boolean isPar(){
    return this.numero % 2 == 0;
  }

  @Override
  public String toString() {
    return this.numero+"";
  }
}
