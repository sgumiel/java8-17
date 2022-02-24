package java08.ejemplos06lambdas;

import java.util.function.Function;

public class LambdaComoFunctionApplication {

  public static void main(String[] args) {

    Function<String, String> gritar = (String input) -> input.toUpperCase();

    String susurroLowerCase = "susurro";
    String casaLowerCase = "casa";

    String susurroUpperCase = gritar.apply(susurroLowerCase);
    String casaUpperCase = gritar.apply(casaLowerCase);

    System.out.println(susurroUpperCase);
    System.out.println(casaUpperCase);
  }

}
