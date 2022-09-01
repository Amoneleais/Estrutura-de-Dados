package pilhas;
/**
 * Testes
 */
public class Testes {
    /**
     * @param args
     */
    public static void main(String[] args) {
        

        Pilha pilha01 = new Pilha();
        
        System.out.println("\n");
        
        // ! Utilizando o método imprimir em pilha vazia |
        pilha01.imprimir(); // ! Excessão

        // * Utilizando o método push para inserir elementos na pilha |
        pilha01.push(2);
        pilha01.push(4);
        pilha01.push(5);
        pilha01.push(7);
        pilha01.push(8);
        pilha01.push(10);
        
        // * Imprimindo a pilha |
        pilha01.imprimir();
        
        // * Utilizando o método pop para remoção do elemento no topo da pilha |
        pilha01.pop();
        pilha01.pop();
        pilha01.pop();
        pilha01.pop();
        
        pilha01.imprimir();
        
        // * Instanciando a pilha em um tamanho definido |
        Pilha pilha02 = new Pilha(5);
        
        pilha02.push(7);
        pilha02.push(13);
        pilha02.push(47);
        pilha02.push(16);
        pilha02.push(52);

        pilha02.imprimir();

        // ! Inserção em pilha "cheia" |
        pilha02.push(51); // ! Excessão
        pilha02.push(25); // ! Excessão
        pilha02.push(18); // ! Excessão
        
        pilha02.imprimir();
        
        pilha02.pop();
        pilha02.pop();
        
        pilha02.imprimir();

    }    
}