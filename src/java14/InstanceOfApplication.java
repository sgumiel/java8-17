package java14;

public class InstanceOfApplication {

  public static void main(String[] args) {

    var perro = new Perro("Yako");
    var gato = new Gato(2);

    imprimirDatos(perro);
    imprimirDatos(gato);
  }

  private static void imprimirDatos(Animal animal) {

    if(animal instanceof Perro perro) {
      System.out.println("Nombre:" + perro.getNombre());
    }

    if(animal instanceof Gato gato){
      System.out.println("Edad: " + gato.getEdad());
    }
  }

}

interface Animal {}

class Perro implements Animal{
  private String nombre;
  Perro(String nombre){
    this.nombre = nombre;
  }
  public String getNombre() { return this.nombre; }
}

class Gato implements Animal{

  private Integer edad;

  Gato(Integer edad){
    this.edad = edad;
  }

  public Integer getEdad(){ return this.edad; }

}
