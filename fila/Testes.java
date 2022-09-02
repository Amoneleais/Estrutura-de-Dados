package fila;

import java.util.Random;

public class Testes {
    public static void main(String[] args) {
        
        Random random = new Random();
        Fila fila = new Fila();
        
        fila.enqueue(random.nextLong(1000));
        fila.enqueue(random.nextLong(1000));
        fila.enqueue(random.nextLong(1000));
        
        fila.imprimir();

        fila.dequeue();
        fila.dequeue();
        fila.dequeue();
        
        fila.imprimir();

        fila.enqueue(random.nextLong(1000));
        fila.enqueue(random.nextLong(1000));
        fila.enqueue(random.nextLong(1000));
        fila.enqueue(random.nextLong(1000));
        fila.enqueue(random.nextLong(1000));

        fila.imprimir();
    }
}
