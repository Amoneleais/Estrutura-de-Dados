package pilhas;
/**
 * Pilha
 */
public class Pilha {
    
    private No topo;
    private int tamanho;
    private int max;

    //Construtor para definir tamanho da pilha |
    public Pilha(int max){
        this.max = max;
    }

    //Verifica se a pilha está vazia |
    public boolean PilhaVazia(){    
        return topo == null;
    }

    //Insere elemento no topo da pilha |
    public void Push(int elemento){
        No novo = new No(elemento, this.topo);
        this.topo = novo;
        if(tamanho == max){
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
            tamanho++;
        }
    }

    //Remove elemento no topo da pilha | - Método LIFO (Last-in-First-out)
    public void Pop(){
        if(PilhaVazia()){
            System.out.println("[ PILHA VAZIA! ]");
        }
        else{
            this.topo = this.topo.getProx();
            tamanho--;
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
            System.out.println(" - Tamanho da Lista: "+tamanho);
        }
    }
}
