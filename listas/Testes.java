package listas;
/**
 * Testes
 */
public class Testes {
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        ListaEncadeada Lista = new ListaEncadeada();

        // * 1 - Lista Vazia |
        System.out.println("\nLista Vazia: "+Lista.listaVazia());

        // * 2 - Utilizando Inserção |
        Lista.inserir(10);
        Lista.inserir(20);
        Lista.inserir(5);
        Lista.inserir(1);
        Lista.inserir(1);
        Lista.inserir(9);
        Lista.inserir(55);
        Lista.inserir(2590);
        Lista.inserir(70);
        Lista.inserir(30);

        // * 3 - Utilizando Impressão |
        Lista.imprimir();

        // * 4 - Utilizando Remoção de Elementos Existentes/Inexistentes |
        Lista.remover(30);
        Lista.remover(55);
        Lista.remover(20);
        Lista.remover(32);// ! Inexistente 

        // * 5 - Utilizando Impressão Após Remoção |
        Lista.imprimir();

        // * 6 - Utilizando Busca |
        Lista.buscar(200);// ! Inexistente 
        Lista.buscar(55);// ! Inexistente 
        Lista.buscar(70);
        Lista.buscar(45);// ! Inexistente 

        // * 7 - Lista Vazia depois de Inserções |
        
        System.out.println("\nLista Vazia: "+Lista.listaVazia()+"\n");
        
    }
    
}
