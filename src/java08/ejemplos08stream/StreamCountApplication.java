package java08.ejemplos08stream;

import java.util.Arrays;
import java.util.List;

public class StreamCountApplication {

  public static void main(String[] args){

    List<String> ciudades = Arrays.asList(new String[] {"Madrid", "Salamanca", "Paris", "Roma", "New York", "Los Angeles", "Cuenca"});

    Long ciudadesConLaLetraO = ciudades.stream()
        .filter(ciudad -> ciudad.contains("o"))
        .count();

    System.out.println("Ciudades que contienen la letra o: " + ciudadesConLaLetraO);
  }

}
