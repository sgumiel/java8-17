package java08.ejemplos07referenciasmetodos;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ReferenciaMetodoApplication {

  public static void main(String[] args) {

    /*
    Function<Persona, Integer> obtenerEdad = Persona::getEdad;
    Consumer<Persona> decirHola = Persona::diHola;

    Persona persona1 = new Persona(18);

    Integer edad = obtenerEdad.apply(persona1);
    System.out.println(edad);
    decirHola.accept(persona1);

     */

    List<Persona> listadePersonas = List.of(new Persona(20), new Persona(30));

    List<Integer> listaEnteros = listadePersonas.stream()
            .map(Persona::getEdad)
            .collect(Collectors.toList());
    System.out.println(listaEnteros);



  }

}

class Persona {

  private int edad;

  Persona(int edad) {
    this.edad = edad;
  }

  public int getEdad(){
    return this.edad;
  }

  public void diHola(){
    System.out.println("Hola!");
  }
}
