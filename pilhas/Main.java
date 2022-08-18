package pilhas;

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
        int tamanho_max;
        System.out.println("\nDefina o tamanho da pilha: [int]");
        tamanho_max = sc.nextInt();
        int elemento;
        Pilha pilha = new Pilha(tamanho_max);

        //Interface simples para testes rápidos |

        while (i) {
            System.out.println("\nTESTE DE PILHA\n\n1 - PUSH\n2 - POP\n3 - IMPRIMIR\n4 - ESVAZIAR\n\n0 - FINALIZAR\n");
            int j = sc.nextInt();
            System.out.println("");
            switch(j){
                case 1:
                    elemento = sc.nextInt();
                    pilha.Push(elemento);
                    break;
                case 2:
                    pilha.Pop();
                    break;
                case 3:
                    pilha.Imprimir();
                    break;
                case 4:
                    pilha.Esvaziar();
                    break;
                case 0:
                    i = false;
                    break;
            }
        }
        sc.close();
    }

}
