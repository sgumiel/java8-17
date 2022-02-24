package java08.ejemplos04nuevasinterfaces;

import java.util.function.Predicate;

public class PredicateApplication {

  public static void main(String[] args) {

    Persona juan = new Persona("Juan", 23);
    Persona sonia = new Persona("Sonia", 6);
    Persona mariluz = new Persona("MariLuz", 50);

    PersonaMayorEdad mayorEdad = new PersonaMayorEdad();

    boolean esJuanMayorEdad = mayorEdad.test(juan);
    boolean esSoniaMayorEdad = mayorEdad.test(sonia);
    boolean esMariluzMayorEdad = mayorEdad.test(mariluz);

    System.out.println("Es juan mayor de edad: " + esJuanMayorEdad);
    System.out.println("Es sonia mayor de edad: " + esSoniaMayorEdad);
    System.out.println("Es mariluz mayor de edad: " + esMariluzMayorEdad);

  }

}

class PersonaMayorEdad implements Predicate<Persona> {

  @Override
  public boolean test(Persona persona) {
    return persona.getEdad() >= 18;
  }
}

class Persona {

  private String nombre;

  private Integer edad;

  public Persona(String nombre, Integer edad) {
    this.nombre = nombre;
    this.edad = edad;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public Integer getEdad() {
    return edad;
  }

  public void setEdad(Integer edad) {
    this.edad = edad;
  }
}