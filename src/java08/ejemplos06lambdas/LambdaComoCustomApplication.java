package java08.ejemplos06lambdas;

public class LambdaComoCustomApplication {

  public static void main(String[] args) {

    Operadores4Numeros suma4Numeros = (num1, num2, num3, num4) -> num1 + num2 + num3 + num4;

    Operadores4Numeros suma3PrimerosYMultiplicaPorElUltimo = (num1, num2, num3, num4) -> (num1 + num2 + num3) * num4;

    Integer resultadoSumar4Numeros = suma4Numeros.apply(1, 1, 2, 2);
    System.out.println("El resultado de sumar 1 + 1 + 2 + 2 = " + resultadoSumar4Numeros);

    Integer resultadoOperacion = suma3PrimerosYMultiplicaPorElUltimo.apply(4,5,2,2);
    System.out.println("El resultado de (4 + 5 + 2) * 2 = " + resultadoOperacion);

  }

}


@FunctionalInterface
interface Operadores4Numeros<T extends Integer, A extends Integer, B extends Integer, C extends Integer, D extends Integer> {
  D apply(T i, A a, B b, C g);
}
