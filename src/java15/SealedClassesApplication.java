package java15;

public class SealedClassesApplication {

  public static void main(String[] args) {

    Automovil ferrari = new Coche("Ferrari");
    System.out.println(ferrari.getMarca());
  }
}

abstract sealed class Automovil permits Coche, Berlina, Suv {
  private String marca;
  Automovil(String marca) { this.marca=marca;}
  public String getMarca(){ return this.marca;}
}

sealed class Coche extends Automovil permits TodoTerreno {
  Coche(String marca){super(marca);}
}

non-sealed class Berlina extends Automovil {
  Berlina(String marca){super(marca);}
}

sealed class Suv extends Automovil permits SuvExtension {
  Suv(String marca){super(marca);}
}

final class TodoTerreno extends Coche {
  TodoTerreno(String marca){super(marca);}
}

final class SuvExtension extends Suv {
  SuvExtension(String marca){super(marca);}
}