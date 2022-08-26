package listasduplas;

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
        ListaEncadeadaDupla lista = new ListaEncadeadaDupla();
        boolean i = true;
        long elemento;

        //Interface simples para testes rápidos |

        while (i) {
            System.out.println("\nTESTE DE LISTA DUPLAMENTE ENCADEADA\n\n1 - INSERIR\n2 - REMOVER\n3 - IMPRIMIR\n4 - BUSCAR\n5 - ESVAZIAR\n\n0 - FINALIZAR\n");
            int j = sc.nextInt();
            System.out.println("");
            switch(j){
                case 1:
                    elemento = sc.nextLong();
                    lista.inserir(elemento);
                    break;
                case 2:
                    elemento = sc.nextLong();
                    lista.remover(elemento);
                    break;
                case 3:
                    lista.imprimir();
                    break;
                case 4:
                    elemento = sc.nextLong();
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
