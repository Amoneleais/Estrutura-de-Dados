package pilhas;
/**
 * Testes
 */
public class Testes {
    public static void main(String[] args) {
        
        Pilha pilha = new Pilha(10);

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
        
        pilha.Imprimir();

        pilha.Push(51);
        pilha.Push(25);
        pilha.Push(18);
        pilha.Push(33);
        pilha.Push(50);
        pilha.Push(65);

        pilha.Imprimir();

        pilha.Pop();
        pilha.Pop();
        pilha.Pop();

        pilha.Imprimir();
    }    
}