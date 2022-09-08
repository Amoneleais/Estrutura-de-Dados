package fila;

public class Fila {
    
    private No fim;
    private int tamanho;

    public Fila(){
 
    }

    public boolean filaVazia(){
        return this.fim == null;
    }

    public void enqueue(long elemento){
        No novo = new No(elemento, this.fim);
        this.fim = novo;
        tamanho++;
    }

    public void dequeue(){
        No anterior = fim;
        for(No auxiliar = this.fim; auxiliar != null; auxiliar = auxiliar.getProx()){
            if(auxiliar.getProx() == null){
                if(auxiliar == this.fim){
                    this.fim = null;
                    tamanho--;
                    return;
                }
                anterior.setProx(null);
                tamanho--;
                break;
            }
            anterior = auxiliar;
        }
    }

    // * Imprime os elementos na pilha |
    public void imprimir(){
        String fila = "";
        //retorna mensagem para o usuário, em caso de pilha vazia.
        if(filaVazia()){
            try {
                throw new Exception("[ FILA VAZIA! ]");
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
        //percorre os nós, por meio de uma variável auxiliar do tipo No até encontrar o nulo.
        for(No auxiliar = this.fim; auxiliar != null; auxiliar = auxiliar.getProx()){
            if(auxiliar.getProx() == null){
                fila += "| ["+auxiliar.getInfo()+"] <- INICIO\n";
                break;
            }
            if(auxiliar == this.fim){
                fila += "| ["+auxiliar.getInfo()+"] <- FIM\n";
            }
            else{
                fila += "| ["+auxiliar.getInfo()+"]\n";
            }
        }
        //impressão da variável pilha.
        System.out.println("\n"+fila);
        System.out.println(" Tamanho da Lista: "+this.tamanho+"\n");
    }
}
