package java08.ejemplos01defaultmetods;

public class LSPApplication {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.saludar();
        cliente.saludar2();
        
        Persona persona = (Persona)cliente;
        persona.saludar();
        persona.saludar2();
        
        Humano humano  = (Humano)cliente;
        humano.saludar();

        Persona p = new Persona();
        p.saludar();
        p.saludar2();

    }
}

interface Humano {
    default void saludar() {
        System.out.println("Hola desde humano");
    }
}

class Persona implements Humano {
    @Override
    public void saludar() {
        System.out.println("Hola desde Persona");
    }
    
    public void saludar2() {
    	System.out.println("Hola con saludar2 desde persona");
    }
}

class Cliente extends Persona {

    @Override
    public void saludar(){
        System.out.println("Hola desde cliente");
    }
    
    @Override
    public void saludar2(){
        System.out.println("Hola desde saludar2 desde cliente");
    }
}
