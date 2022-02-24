package java09;

import java.util.stream.Stream;

public class StreamTakeWhileApplication {

  public static void main(String[] args) {

    Stream<String> nombres = Stream.of("hola", "que", "tal", "estais", "viviendo", "en", "Madrid");
    nombres.takeWhile( (cadena) -> !cadena.contains("v")).forEach( (cadena) -> System.out.println(cadena));
  }

}
