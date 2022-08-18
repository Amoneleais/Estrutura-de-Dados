package pilhas;
/**
 * Testes
 */
public class Testes {
    public static void main(String[] args) {
        
        //Instanciando a pilha em um tamanho definido |
        Pilha pilha = new Pilha(10);

        //Utilizando o método push para inserir elementos na pilha |
        pilha.Push(2);
        pilha.Push(4);
        pilha.Push(5);
        pilha.Push(7);
        pilha.Push(8);
        pilha.Push(10);
        pilha.Push(12);
        pilha.Push(16);
        pilha.Push(20);
        pilha.Push(17);
        
        //Imprimindo a pilha |
        pilha.Imprimir();
        
        //Testando inserir em pilha "cheia" |
        pilha.Push(51);
        pilha.Push(25);
        pilha.Push(18);
        pilha.Push(33);
        pilha.Push(50);
        pilha.Push(65);

        pilha.Imprimir();

        //Utilizando o método pop para remoção do elemento no topo da pilha |
        pilha.Pop();
        pilha.Pop();
        pilha.Pop();

        pilha.Imprimir();
    }    
}