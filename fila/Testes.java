package fila;

import java.util.Random;

public class Testes {
    public static void main(String[] args) {
        
        Random random = new Random();
        Fila fila = new Fila();
        
        // * Utilizando o método enqueue para inserir elementos na fila | 
        fila.enqueue(random.nextLong(1000));
        fila.enqueue(random.nextLong(1000));
        fila.enqueue(random.nextLong(1000));
        
        // * Imprimindo a fila com o método imprimir |
        fila.imprimir();

        // * Removendo o elemento mais antigo da fila com o método dequeue |
        fila.dequeue();
        fila.dequeue();
        fila.dequeue();
        
        fila.imprimir();

        // * Inserção após esvaziar a pilha |
        fila.enqueue(random.nextLong(1000));
        fila.enqueue(random.nextLong(1000));
        fila.enqueue(random.nextLong(1000));
        fila.enqueue(random.nextLong(1000));
        fila.enqueue(random.nextLong(1000));

        fila.imprimir();
    }
}
