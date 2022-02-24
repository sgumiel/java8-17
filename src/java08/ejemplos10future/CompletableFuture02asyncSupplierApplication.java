package java08.ejemplos10future;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFuture02asyncSupplierApplication {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        CompletableFuture<String> completableFutureString = CompletableFuture.supplyAsync(() -> "HOLA");
        System.out.println(completableFutureString.get());

        CompletableFuture<Persona> completableFuturePersona =
                CompletableFuture.supplyAsync(() -> new Persona("Sergio", "Perez"));
        System.out.println(completableFuturePersona.get());
    }
}

class Persona {

    String nombre;
    String apellidos;

    Persona(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Apellidos: " + apellidos;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellidos() {
        return this.apellidos;
    }
}
