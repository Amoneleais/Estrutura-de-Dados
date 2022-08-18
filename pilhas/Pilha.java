package pilhas;
/**
 * Pilha
 */
public class Pilha {
    
    private No topo;
    private int tamanho_atual;
    private int tamanho_max;

    //Construtor para definir tamanho da pilha |
    public Pilha(int tamanho_max){
        this.tamanho_max = tamanho_max;
    }

    //Verifica se a pilha está vazia |
    public boolean PilhaVazia(){    
        return topo == null;
    }

    //Insere elemento no topo da pilha |
    public void Push(int elemento){
        No novo = new No(elemento, this.topo);
        this.topo = novo;
        if(tamanho_atual == tamanho_max){
            No anterior = null;
            for(No auxiliar = this.topo; auxiliar != null; auxiliar = auxiliar.getProx()){
                if(auxiliar.getProx()==null){
                    anterior.setProx(auxiliar.getProx());
                    break;
                }
                anterior = auxiliar;
            }
        }
        else{
            tamanho_atual++;
        }
    }

    //Remove elemento no topo da pilha | - Método LIFO (Last-in-First-out)
    public void Pop(){
        if(PilhaVazia()){
            System.out.println("[ PILHA VAZIA! ]");
        }
        else{
            this.topo = this.topo.getProx();
            tamanho_atual--;
        }
    }

    //Imprime os elementos na pilha |
    public void Imprimir(){
        String pilha = "";
        if(PilhaVazia()){
            System.out.println("\n [ LISTA VAZIA! ]");
        }
        else{
            for(No auxiliar = this.topo; auxiliar != null; auxiliar = auxiliar.getProx()){
                pilha += "| ["+auxiliar.getInfo()+"]\n";
            }
            System.out.println("\n"+pilha);
            System.out.println(" - Tamanho da Lista: "+tamanho_atual);
        }
    }
}
