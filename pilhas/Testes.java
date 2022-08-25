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
        
        //Utilizando o método push para inserir elementos na pilha |
        pilha01.Push(2);
        pilha01.Push(4);
        pilha01.Push(5);
        pilha01.Push(7);
        pilha01.Push(8);
        pilha01.Push(10);

        //Imprimindo a pilha |
        pilha01.Imprimir();
        
        //Utilizando o método pop para remoção do elemento no topo da pilha |
        pilha01.Pop();
        pilha01.Pop();
        pilha01.Pop();
        pilha01.Pop();

        pilha01.Imprimir();

        pilha01.Pop();
        pilha01.Pop();
        pilha01.Pop();

        pilha01.Imprimir();

        pilha01.Push(60);
        pilha01.Push(800);

        pilha01.Imprimir();
        
        /*
        //Instanciando a pilha em um tamanho definido |
        Pilha pilha02 = new Pilha(5);

        pilha02.Push(7);
        pilha02.Push(13);
        pilha02.Push(47);
        pilha02.Push(16);
        pilha02.Push(52);
        
        pilha02.Imprimir();

        //Testando inserir em pilha "cheia" |
        pilha02.Push(51);
        pilha02.Push(25);
        pilha02.Push(18);

        pilha02.Imprimir();

        pilha02.Pop();
        pilha02.Pop();

        pilha02.Imprimir();
        
        */
    }    
}