package java08.ejemplos05optional;

import java.util.Optional;
import java.util.function.Predicate;

public class OptionalFilterApplication {

  public static void main(String[] args){

    CadenaEmpiezaPorA cadenaEmpiezaPorA = new CadenaEmpiezaPorA();

    Optional<String> optional1 = Optional.of("Sergio");
    Optional<String> sergioOp = optional1.filter(cadenaEmpiezaPorA);
    System.out.println(sergioOp);

    Optional<String> optional2 = Optional.of("Avion");
    Optional<String> avionOp = optional2.filter(cadenaEmpiezaPorA);
    System.out.println(avionOp);

    Optional<String> optional3 = Optional.ofNullable(null);
    Optional<String> optionalEmpty = optional3.filter(cadenaEmpiezaPorA);
    System.out.println(optionalEmpty);


  }

}

class CadenaEmpiezaPorA implements Predicate<String> {

  @Override
  public boolean test(String cadena) {
    return cadena.startsWith("A");
  }
}
