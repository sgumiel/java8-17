package java08.ejemplos10future;

import java.time.Instant;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFuture05runAsyncThreadPoolApplication {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        System.out.println("Inicio metodo main end thread: " + Thread.currentThread().getName() +". Now " + Instant.now());
        CompletableFuture.runAsync(dormir("1", 2000));
        CompletableFuture.runAsync(dormir("2", 5000));
        CompletableFuture.runAsync(dormir("3", 3000));

        System.out.println("Fin metodo main end thread: " + Thread.currentThread().getName() +". Now " + Instant.now());
    }

    public static Runnable dormir(String tag, long milis) {
        return () -> {
            System.out.println("Empezamos calculos" + tag + " en tread: " + Thread.currentThread().getName() + " " + Instant.now());
            try {
                Thread.sleep(milis);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Fin calculos" + tag + " en tread: " + Thread.currentThread().getName() + " " + Instant.now());
        };
    }
}