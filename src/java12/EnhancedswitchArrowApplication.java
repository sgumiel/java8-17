package java12;

public class EnhancedswitchArrowApplication {

  public static void main(String[] args) {

    var type = 2;
    int result = 0;

    switch (type) {
      case 1 -> result = 1;
      case 2 -> result = 3;
      case 3 -> result = 10;
      //case 4 -> 515;
    }

    System.out.println(result);
  }

}
