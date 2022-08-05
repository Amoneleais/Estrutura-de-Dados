package listas;
/**
 * ListaEncadeada
 */
public class ListaEncadeada {

    private No ref;
    private int tamanho;

    public ListaEncadeada(){
        
    }

    //Verifica se a lista está vazia
    public boolean ListaVazia(){    
        return ref == null;
    }

    //Insere Elemento na Lista Encadeada
    public void Inserir(int info){
        No novo = new No(info, ref);
        this.ref = novo;
        this.tamanho++;
    }

    //Remove Elemento na Lista Encadeada
    public void Remover(int info){
        No anterior = null;
        for(No auxiliar = ref; auxiliar != null; auxiliar = auxiliar.getProx()){
            if(auxiliar.getInfo() == info){    
                if(auxiliar == this.ref){
                    ref = auxiliar.getProx();
                    this.tamanho--;
                    System.out.println(" \n"+info+" removido com sucesso!");
                    break;
                } 
                else {
                    anterior.setProx(auxiliar.getProx());
                    System.out.println(" \n"+info+" removido com sucesso!");
                    this.tamanho--;
                    break;
                }
            }
            else if(auxiliar.getProx() == null & auxiliar.getInfo() != info){
                System.out.println("\n [ REMOVER: ELEMENTO NÃO EXISTENTE! ]");
            }
            anterior = auxiliar;
        }
    }

    //Buscar Elemento na Lista Encadeada
    public void Buscar(int info){
        for(No auxiliar = this.ref; auxiliar != null; auxiliar = auxiliar.getProx()){
            if(auxiliar.getInfo() == info){
                System.out.println("\n "+info+" existente na lista!");
                break;
            }
            else if(auxiliar.getProx() == null & auxiliar.getInfo() != info){
                System.out.println("\n [ BUSCAR: ELEMENTO NÃO EXISTENTE! ]");
            }
        }
    }

    //Imprime os Elementos da Lista Encadeada
    public void Imprimir(){
        String lista = " ";
        if(ListaVazia()){
            System.out.println("\n [ LISTA VAZIA! ]");
        }
        else{
            for(No auxiliar = this.ref; auxiliar != null; auxiliar = auxiliar.getProx()){
                lista += "["+auxiliar.getInfo()+"] ";
            }
            System.out.println("\n"+lista);
            System.out.println(" Tamanho da Lista: "+tamanho);
        }
    }
    
}
