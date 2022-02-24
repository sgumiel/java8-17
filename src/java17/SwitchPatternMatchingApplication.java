package java17;

public class SwitchPatternMatchingApplication {

  public static void main(String[] args){

    Object frase = 1L;

    var resultado = switch (frase) {
      case Integer entero -> 0;
      case String s -> 1;
          default -> -1;
    };

    System.out.println(resultado);
  }

}
