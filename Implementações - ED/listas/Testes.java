package listas;

public class Testes {
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        ListaEncadeada Lista = new ListaEncadeada();

        //1 - Lista Vazia |
        System.out.println("\nLista Vazia: "+Lista.ListaVazia());

        //2 - Utilizando Inserção |
        Lista.Inserir(10);
        Lista.Inserir(20);
        Lista.Inserir(5);
        Lista.Inserir(1);
        Lista.Inserir(1);
        Lista.Inserir(9);
        Lista.Inserir(55);
        Lista.Inserir(2590);
        Lista.Inserir(70);
        Lista.Inserir(30);

        //3 - Utilizando Impressão |
        Lista.Imprimir();

        //4 - Utilizando Remoção de Elementos Existentes/Inexistentes |
        Lista.Remover(30);
        Lista.Remover(55);
        Lista.Remover(20);
        Lista.Remover(32);

        //5 - Utilizando Impressão Após Remoção |
        Lista.Imprimir();

        //6 - Utilizando Busca |
        Lista.Buscar(200);
        Lista.Buscar(55);
        Lista.Buscar(70);
        Lista.Buscar(45);

        //7 - Lista Vazia depois de Inserções |
        
        System.out.println("\nLista Vazia: "+Lista.ListaVazia()+"\n");
        
    }
}
