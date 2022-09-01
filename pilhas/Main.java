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
        long elemento;
        System.out.println("\nDefina o tamanho da pilha [0 == ilimitado]");
        int tamanho = sc.nextInt();

        //Definindo tamanho de pilha |
        Pilha pilha = new Pilha(tamanho);

        // * Interface simples para testes rápidos |

        while (i) {
            System.out.println("\nTESTE DE PILHA\n\n1 - PUSH\n2 - POP\n3 - IMPRIMIR\n4 - ESVAZIAR\n\n0 - FINALIZAR\n");
            int k = sc.nextInt();
            System.out.println("");
            switch(k){
                case 1:
                    elemento = sc.nextLong();
                    pilha.push(elemento);
                    break;
                case 2:
                    pilha.pop();
                    break;
                case 3:
                    pilha.imprimir();
                    break;
                case 4:
                    pilha.esvaziar();
                    break;
                case 0:
                    i = false;
                    break;
            }
        }
        sc.close();
    }

}
