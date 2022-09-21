package fila;
/**
 * No
 */
public class Testes {
    public static void main(String[] args) {
        
        Filalista fila = new Filalista();
        
        // * Utilizando o método enqueue para inserir elementos na fila | 
        fila.enqueue(2);
        fila.enqueue(125);
        fila.enqueue(40);
        fila.enqueue(65);
        fila.enqueue(499);
        
        // * Imprimindo a fila com o método imprimir |
        fila.imprimir();

        // * Utilizando o método dequeue para remover o elemento mais antigo na fila |
        fila.dequeue();
        fila.dequeue();
        fila.dequeue();

        fila.imprimir();

        // * Removendo todos os elementos |
        fila.dequeue();
        fila.dequeue();

        // ! Tentando remover elementos em fila vazia |
        fila.dequeue();

        fila.imprimir();

        // * Reiserindo após esvaziar |
        fila.enqueue(39);
        fila.enqueue(58);
        fila.enqueue(34);
        fila.enqueue(66);

        fila.imprimir();
    }
}
