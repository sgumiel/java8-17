package java12;

public class EnhancedswitchMultipleApplication {

  public static void main(String[] args) {

    int integer = 10;
    String numericString =
        switch (integer) {
          case 1, 2, 3, 4 -> "numero bajo";
          case 5, 6, 7, 8 -> "numero medio";
          default -> "numero alto";
        };
    System.out.println(numericString);
  }

}
