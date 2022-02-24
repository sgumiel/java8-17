package java08.ejemplos10future;

import java.time.Instant;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CompletableFuture07runAsyncMyThreadPoolApplication {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService threadPool = Executors.newFixedThreadPool(3);
        System.out.println("Inicio metodo main: " + Instant.now());
        CompletableFuture<Void> futureVoid1 = CompletableFuture.runAsync(dormir("1", 2000), threadPool);
        CompletableFuture<Void> futureVoid2 = CompletableFuture.runAsync(dormir("2", 7000), threadPool);
        CompletableFuture<Void> futureVoid3 = CompletableFuture.runAsync(dormir("3", 4000), threadPool);

        threadPool.shutdown();
        System.out.println("Fin metodo main: " + Instant.now());
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