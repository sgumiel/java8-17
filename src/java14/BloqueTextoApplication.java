package java14;

public class BloqueTextoApplication {

  public static void main(String[] args) {

    var chiquitoIpsum = """
        Lorem fistrum jarl no puedor jarl \
        te voy a borrar el cerito \
        me cago en tus muela
        """;

    System.out.println(chiquitoIpsum);

    var lines = """
            line 1       
            line 2         \s
            line 3      
            """;
    System.out.println(lines);

  }

}
