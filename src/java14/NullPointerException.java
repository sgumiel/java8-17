package java14;

public class NullPointerException {

  public static void main(String[] args) {

    var renault = new Marca();
    renault.nombre = "Renault";
    var seat = new Marca();
    seat.nombre = "Seat";

    var c5 = new Coche();
    c5.marca = renault;
    c5.modelo = "C5";
    var altea = new Coche();
    altea.marca=seat;
    altea.modelo="Altea";

    var tiendaCoches = new TiendaCoches();
    tiendaCoches.coches = new Coche[1];
    tiendaCoches.coches[0] = null;

    System.out.println(tiendaCoches.coches[0].marca.nombre);
  }

}

class Marca {
  String nombre;
}

class Coche {
  Marca marca;
  String modelo;
}

class TiendaCoches {
  Coche[] coches;
}
