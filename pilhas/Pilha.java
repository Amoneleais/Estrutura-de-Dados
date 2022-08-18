package pilhas;

public class Pilha {
    
    private No topo;
    private int tamanho;
    private int max;

    public Pilha(int max){
        this.max = max;
    }

    public boolean PilhaVazia(){    
        return topo == null;
    }

    public void Push(int elemento){
        if(tamanho == max){
            No novo = new No(elemento, this.topo);
            topo = novo;
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
            No novo = new No(elemento, this.topo);
            this.topo = novo;
            tamanho++;
        }
    }

    public void Pop(){
        if(PilhaVazia()){
            System.out.println("[ PILHA VAZIA! ]");
        }
        else{
            this.topo = this.topo.getProx();
            tamanho--;
        }
    }

    public void Imprimir(){
        String pilha = "";
        if(PilhaVazia()){
            System.out.println("\n [ LISTA VAZIA! ]");
        }
        else{
            for(No auxiliar = this.topo; auxiliar != null; auxiliar = auxiliar.getProx()){
                pilha += "["+auxiliar.getInfo()+"]\n";
            }
            System.out.println("\n"+pilha);
            System.out.println(" Tamanho da Lista: "+tamanho);
        }
    }
}
