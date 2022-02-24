package java08.ejemplos03functionalinterface;

public class Armario implements Montable {

  @Override
  public Boolean isMontable() {
    return null;
  }
}

@FunctionalInterface
interface Montable {

  Boolean isMontable();

  //Integer numeroPiezas();


  default String tienda() {
    return "IKEA";
  }



  static void datosEnCadena(String tienda, Boolean esMontable) {
    System.out.println("El mueble de la tienda: " + tienda + " es montable: " + esMontable);
  }

}

