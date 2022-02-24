package java08.ejemplos08stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class StreamForEachApplication {

  public static void main(String[] args){

    List<String> nombres = Arrays.asList(new String[] {"Nuria", "Laura", "David", "Jose"});

    ImprimirCadena imprimirCadena = new ImprimirCadena();
    nombres.stream().forEach(imprimirCadena);
    nombres.stream().forEach( name -> System.out.println(name));
    List<Nombre> nombresLista = nombres.stream().map(Nombre::new).collect(Collectors.toList());
    nombresLista.stream().forEach(Nombre::imprimirNombre);


  }

}

class ImprimirCadena implements Consumer<String> {
  @Override
  public void accept(String cadena) {
    System.out.println(cadena);
  }
}

class Nombre {

  private String nombre;

  Nombre(String n){
    this.nombre = n;
  }

  public void imprimirNombre(){
    System.out.println(this.nombre);
  }
}
