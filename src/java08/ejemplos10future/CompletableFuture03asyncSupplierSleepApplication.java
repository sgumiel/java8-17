package java08.ejemplos10future;

import java.time.Instant;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFuture03asyncSupplierSleepApplication {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        System.out.println("Inicio: " + Instant.now());
        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(
                () -> {
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    return "Hola";
                });


        String value = completableFuture.get();
        System.out.println(value);


        System.out.println("Fin: " + Instant.now());
    }
}
