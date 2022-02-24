package java08.ejemplos08stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamMapApplication {

  public static void main(String[] args) {

    MultiplicaPor2 multiplicaPor2 = new MultiplicaPor2();
    List<Integer> listaDeNumerosImpares = Arrays.asList(new Integer[] {1, 3, 5, 7, 9});

    List<Integer> listaDeNumerosParesConFunction = listaDeNumerosImpares.stream()
        .map((Integer entero) -> entero * 5)
        .collect(Collectors.toList());

    System.out.println(listaDeNumerosParesConFunction);

    List<Integer> listaDeNumerosRestados1ConLambdas = listaDeNumerosImpares.stream()
        .map((numero) -> numero - 1)
        .collect(Collectors.toList());

    System.out.println(listaDeNumerosRestados1ConLambdas);

    List<String> nombresMinusculas = Arrays.asList(new String[] {"juan", "raquel"});

    List<String> nombresMayusculasConReferenciasDeMetodos = nombresMinusculas.stream()
        .map(String::toUpperCase)
        .collect(Collectors.toList());

    System.out.println(nombresMayusculasConReferenciasDeMetodos);

  }

}

class MultiplicaPor2 implements Function<Integer, Integer> {

  @Override
  public Integer apply(Integer numero) {
    return numero * 2;
  }
}
