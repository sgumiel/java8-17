package java08.ejemplos01defaultmetods;

public class DefaultMethodApplication {

  public static void main(String[] args) {

    OperacionSumar operacionSumar = new OperacionSumar();

    Integer resultado = operacionSumar.sumar(5, 6);
    Integer numeroOperandos = operacionSumar.numeroOperandos();

    System.out.println("Resultado: " + resultado);
    System.out.println("Numeo operandos: " + numeroOperandos);
    System.out.println(operacionSumar.numeroOperandos());
  }

}

class OperacionSumar implements Sumar2Numeros{

  @Override
  public Integer sumar(Integer op1, Integer op2) {
    return op1 + op2;
  }

  public Integer numeroOperandos(){
    return 3;
  }

}

interface Sumar2Numeros {

  Integer sumar(Integer operando1, Integer operando2);

  default Integer numeroOperandos(){
    return 2;
  }
}
