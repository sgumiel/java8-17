package java08.ejemplos08stream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamCollectApplication {

  public static void main(String[] args) {

    List<Integer> listaDeNumerosPares = Arrays.asList(new Integer[] {2, 4, 6, 8, 10, 10});

    List<Integer> setDeNumerosPares = listaDeNumerosPares.stream()
        .collect(Collectors.toList());

    System.out.println(setDeNumerosPares);
  }

}
