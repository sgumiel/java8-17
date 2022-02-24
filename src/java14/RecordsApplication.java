package java14;

public class RecordsApplication {

  public static void main(String[] args) {

    var miRecord = new Persona("Sergio", 39);
    var miRecord2 = new Persona("Sergio", 39);

    System.out.println(miRecord.equals(miRecord2));
    System.out.println(miRecord);
    System.out.println(miRecord2.equals(miRecord));
    System.out.println(miRecord.nombre());
    System.out.println(miRecord.edad());

    var espania1 = new Pais("Madrid");
    var espania2= new Pais("Madrid");

    System.out.println(espania1.equals(espania2));
  }

}

record Persona(String nombre, Integer edad){}

class Pais {

  String capital;

  Pais(String capital) { this.capital=capital;}

  public String getCapital(){return this.capital;}
}