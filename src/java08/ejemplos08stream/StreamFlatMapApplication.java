package java08.ejemplos08stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFlatMapApplication {

  public static void main(String[] args){

    List<String> nombresEspanioles = Arrays.asList(new String[] {"Nuria", "Laura", "David", "Jose"});
    List<String> nombresIngleses = Arrays.asList(new String[] {"John", "Kimberly", "Tom"});
    List<List<String>> listaDeListas = Arrays.asList(new List[] {nombresEspanioles, nombresIngleses});

    List<String> nombres = listaDeListas.stream()
        .flatMap((nombresPorPaises) -> nombresPorPaises.stream())
        .collect(Collectors.toList());

    System.out.println(nombres);
  }

}
