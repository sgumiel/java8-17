package java12;

import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsTeeingApplication {

  public static void main(String[] args) {
    Range range = Stream
        .of(1, 8, 2, 5)
        .collect(Collectors.teeing(
            Collectors.minBy(Integer::compareTo),
            Collectors.maxBy(Integer::compareTo),
            Range::ofOptional));

    System.out.println(range);

  }

}

class Range {

  private int min;
  private int max;

  Range(int min, int max){
    this.min = min;
    this.max = max;
  }

  public int getMin(){ return this.min; }
  public int getMax(){ return this.max; }

  public static Range ofOptional(Optional<Integer> min, Optional<Integer> max) {
    return  new Range(min.get(), max.get());

  }

  @Override
  public String toString() {
    return "min: " + min + ", max: " + max;
  }
}
