package fila;

public class Main {
    public static void main(String[] args) {
        
        Fila fila = new Fila();

        fila.enqueue(12);
        fila.enqueue(40);
        fila.enqueue(77);
        
        fila.imprimir();

        fila.dequeue();
        fila.dequeue();
        fila.dequeue();

        
        fila.imprimir();
    }
}
