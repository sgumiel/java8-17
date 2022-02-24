package java17;

public class SwitchCaseNullApplication {

  public static void main(String[] args){

    Object cadena = "A";

    var resultado = switch (cadena) {
      case null -> "La cadena es nula";
      case String s -> "La cadena no es nula" + s;
      default -> "No es una cadena";
    };

    System.out.println(resultado);
  }


}
