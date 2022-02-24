package java08.ejemplos02staticmethodinterface;

public class StaticMethodInterfaceApplication {

  public static void main(String[] args){

    PresidentePais humano1 = new PresidentePais("Pedro", "Sanchez", "Espania");

    System.out.println(Humano.toNombreCompleto(humano1.getNombre(),
            humano1.getPrimerApellido()));

  }

}

interface Humano {

  String getNombre();
  String getPrimerApellido();

  static String toNombreCompleto(String nombre, String apellido) {
    return nombre + " " + apellido;
  }
}

class PresidentePais implements Humano {

  private String nombre;
  private String primerApellido;
  private String pais;

  PresidentePais(String nombre, String primerApellido, String pais){
    this.pais = pais;
    this.nombre = nombre;
    this.primerApellido = primerApellido;
  }

  @Override
  public String getNombre() {
    return this.nombre;
  }

  @Override
  public String getPrimerApellido() {
    return this.primerApellido;
  }
}