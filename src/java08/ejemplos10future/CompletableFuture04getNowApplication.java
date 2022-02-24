package java08.ejemplos10future;

import java.time.Instant;
import java.util.concurrent.CompletableFuture;

public class CompletableFuture04getNowApplication {

    public static void main(String[] args){

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
        System.out.println("Fin: " + Instant.now());
        String value = completableFuture.getNow("Valor por defecto");
        System.out.println(value);
    }
}
