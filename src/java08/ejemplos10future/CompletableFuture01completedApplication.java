package java08.ejemplos10future;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFuture01completedApplication {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        CompletableFuture<String> completableFutureHola = CompletableFuture.completedFuture("Hola");
        System.out.println(completableFutureHola.get());

        CompletableFuture<Integer> completableFuture17 = CompletableFuture.completedFuture(17);
        System.out.println(completableFuture17.get());
    }
}
