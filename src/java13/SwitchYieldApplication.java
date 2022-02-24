package java13;

public class SwitchYieldApplication {

  public static void main(String[] args) {

    int integer = 5;
    int numero =
        switch (integer) {
          case 1 -> {
            int resultado = calculo(integer, 1);
            yield  resultado;
          }
          case 2 -> {
            int resultado = calculo(integer, 2);
            yield  resultado;
          }
          case 3 -> {
            int resultado = calculo(integer, 3);
            yield  resultado;
          }
          default -> 0;
        };
    System.out.println(numero);
  }

  private static int calculo(int numero, int multiplicando){
    return numero * multiplicando;
  }

}
