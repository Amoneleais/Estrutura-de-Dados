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
        Fila fila = new Fila();
        boolean i = true;
        int elemento;

        // * Interface simples para testes rápidos |

        while (i) {
            System.out.println("\nTESTE DE FILA\n\n1 - ENFILEIRAR\n2 - DESENFILEIRAR\n3 - IMPRIMIR\n4 - ESVAZIAR\n\n0 - FINALIZAR\n");
            int j = sc.nextInt();
            System.out.println("");
            switch(j){
                case 1:
                    elemento = sc.nextInt();
                    fila.enqueue(elemento);
                    break;
                case 2:
                    fila.dequeue();
                    break;
                case 3:
                    fila.imprimir();
                    break;
                case 4:
                    fila.esvaziar();
                    break;
                case 0:
                    i = false;
                    break;
            }
        }
        sc.close();
    }

}
