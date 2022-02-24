package java10;

public class InferenciasTipoApplication {

  public static void main(String[] args) {

    var numeroEntero5 = 5;
    var sergio = "sergio";
    var caracter = 'c';
    var persona = new Persona("Juan", "Diaz");

  }

}

class Persona {

  private String nombre;
  private String apellido;

  Persona(String nombre, String apellido) {
    this.nombre=nombre;
    this.apellido=apellido;
  }
}
