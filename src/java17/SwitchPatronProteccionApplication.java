package java17;

public class SwitchPatronProteccionApplication {

  public static void main(String[] args){

    Object cadena = null;

    var resultado = switch (cadena) {
      case String s && (s.length()==13) -> "La cadena; " + cadena + " tiene longitud 13";
      case String s -> "La cadena: " + cadena + " tiene longitud distinta de 13";
      case Integer n -> "El objeto es un entero: " + n;
      case null -> "El objeto es nulo";
      default -> "la variable no se sabe lo que es";
    };

    System.out.println(resultado);
  }

}
