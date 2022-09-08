package fila;

import java.util.Scanner;
/**
 * Main
 */
public class Main {
        /**
     * @param args
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        boolean i = true;
        long elemento;
        System.out.println("\nDefina o tamanho da fila [0 == ilimitado]");
        int tamanho = sc.nextInt();

        //Definindo tamanho de pilha |
        Fila fila = new Fila();

        // * Interface simples para testes rápidos |

        while (i) {
            System.out.println("\nTESTE DE FILA\n\n1 - ENQUEUE\n2 - DEQUEUE\n3 - IMPRIMIR\n4 - ESVAZIAR\n\n0 - FINALIZAR\n");
            int k = sc.nextInt();
            System.out.println("");
            switch(k){
                case 1:
                    elemento = sc.nextLong();
                    fila.enqueue(elemento);
                    break;
                case 2:
                    fila.dequeue();
                    break;
                case 3:
                    fila.imprimir();
                    break;
                case 4:
                    break;
                case 0:
                    i = false;
                    break;
            }
        }
        sc.close();
    }

}
