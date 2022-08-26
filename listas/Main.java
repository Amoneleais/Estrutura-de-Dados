package listas;

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
        ListaEncadeada lista = new ListaEncadeada();
        boolean i = true;
        int elemento;

        //Interface simples para testes rápidos |

        while (i) {
            System.out.println("\nTESTE DE LISTA ENCADEADA\n\n1 - INSERIR\n2 - REMOVER\n3 - IMPRIMIR\n4 - BUSCAR\n5 - ESVAZIAR\n\n0 - FINALIZAR\n");
            int j = sc.nextInt();
            System.out.println("");
            switch(j){
                case 1:
                    elemento = sc.nextInt();
                    lista.inserir(elemento);
                    break;
                case 2:
                    elemento = sc.nextInt();
                    lista.remover(elemento);
                    break;
                case 3:
                    lista.imprimir();
                    break;
                case 4:
                    elemento = sc.nextInt();
                    lista.buscar(elemento);
                    break;
                case 5:
                    lista.esvaziar();
                    break;
                case 0:
                    i = false;
                    break;
            }
        }
        sc.close();
    }

}
