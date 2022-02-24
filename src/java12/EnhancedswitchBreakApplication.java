package java12;

public class EnhancedswitchBreakApplication {

  public static void main(String[] args) {

    int integer = 1;
    String numericString =
        switch (integer) {
          case 1 -> "uno";
          case 2 -> "dos";
          case 3 -> "tres";
          default -> "N/A";
        };
    System.out.println(numericString);
  }

}
