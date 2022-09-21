package fila;

public class Filalista {
    
    private No inicio, fim;
    private int tamanho;

    public Filalista(){
        this.inicio = this.fim = null;
    }

    // * Verifica se a fila está vazia |
    public boolean filaVazia(){
        return this.inicio == null;
    }

    // * Insere o elemento no final da fila, caso não haja nenhum elemento, este será o início |
    public void enqueue(long elemento){
        No novo = new No(elemento);
        if(this.fim == null){
            this.inicio = this.fim = novo;
            this.tamanho++;
            return;
        }
        this.fim.setProx(novo);
        this.fim = novo;
        this.tamanho++;
    }

    // * Remove o elemento mais antigo na fila seguindo o método First-in, First-out |
    public void dequeue(){
        //retorna mensagem para o usuário, em caso de fila vazia.
        if(filaVazia()){
            try {
                throw new Exception("[ FILA VAZIA! ]");
            } catch (Exception e) {
                e.printStackTrace();
            }
            return;
        }
        this.inicio = this.inicio.getProx();
        if(this.inicio == null){
            this.fim = null;
        }
        tamanho--;
    }

    // * Imprime os elementos na fila |
    public void imprimir(){
        String fila = "";
        //retorna mensagem para o usuário, em caso de fila vazia.
        if(filaVazia()){
            try {
                throw new Exception("[ FILA VAZIA! ]");
            } catch (Exception e) {
                e.printStackTrace();
            }
            return;
        }
        //percorre os nós, por meio de uma variável auxiliar do tipo No até encontrar o nulo.
        for(No auxiliar = this.inicio; auxiliar != null; auxiliar = auxiliar.getProx()){
            if(auxiliar == this.inicio){
                fila += "| ["+auxiliar.getInfo()+"] <- INICIO\n";
            }
            else if(auxiliar == this.fim){
                fila += "| ["+auxiliar.getInfo()+"] <- FIM\n";
            }
            else{
                fila += "| ["+auxiliar.getInfo()+"]\n";
            }
        }
        //impressão da variável fila.
        System.out.println("\n"+fila);
        System.out.println(" - Tamanho da Fila: "+this.tamanho+"\n");
    }  

    // * Esvazia a fila |
    public void esvaziar(){
        //transforma o inicio em nulo, apagando os nós sucessores.
        this.inicio = this.fim = null;
        this.tamanho = 0;
        System.out.println("\n - A Fila foi Esvaziada");
    }

}
