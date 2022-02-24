package java11;

import java.util.Optional;

public class OptionalIsEmptyApplication {

    public static void main(String[] args){

        Optional<Integer> optionalPresent = Optional.of(50);
        Optional<Integer> optionalEmpty = Optional.ofNullable(null);

        System.out.println(optionalPresent.isEmpty());
        System.out.println(optionalEmpty.isEmpty());
    }
}
