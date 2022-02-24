package java09;

import java.util.stream.Stream;

public class StreamOfNullable {

  public static void main(String[] args) {

    Stream<String> stream1 = Stream.ofNullable("SuperCoche");
    stream1.forEach( cadena -> System.out.println(cadena));

    Stream<String> stream2 = Stream.ofNullable(null);
    stream2.forEach( cadena -> System.out.println(cadena));
  }

}
