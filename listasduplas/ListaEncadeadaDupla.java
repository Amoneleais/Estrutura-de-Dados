package listasduplas;
/**
 * ListaEncadeadaDupla
 */
public class ListaEncadeadaDupla {
    
    private No ref;
    private int tamanho;

    public ListaEncadeadaDupla(){
        
    }

    // * Verifica se a lista está vazia |
    public boolean listaVazia(){    
        return this.ref == null;
    }

    // * Insere Elemento na Lista Dupla |
    public void inserir(long elemento){
        No novo = new No(elemento, null,this.ref);
        //caso a lista não esteja vazia, o nó anterior da referência se tornará o nó novo.
        if(listaVazia() == false){
            this.ref.setAnterior(novo);
        }
        //referência se tornará o novo nó.
        this.ref = novo;
        this.tamanho++;
    }

    // * Remove Elemento na Lista Dupla |
    public void remover(long elemento){
        No anterior = null;
        if(listaVazia()){
            try {
                throw new Exception("[ REMOVER: LISTA VAZIA! ]");
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
        //percorre os nós, por meio de uma variável auxiliar do tipo No até encontrar o nulo.
        for(No auxiliar = this.ref; auxiliar != null; auxiliar = auxiliar.getProx()){
            //em caso de elemento inexistente.
            if(auxiliar.getProx() == null && auxiliar.getInfo() != elemento){
                try {
                    throw new Exception("[ REMOVER: ELEMENTO NÃO EXISTENTE! ]");
                } catch (Exception e) {
                    e.printStackTrace();
                    break;
                }
            }
            //condicional, caso a info do nó atual ser igual ao elemento a ser removido.
            else if(auxiliar.getInfo() == elemento){    
                //caso o elemento seja a referência e haja sucessor.
                if(auxiliar == this.ref & this.ref.getProx() != null){
                    ref = auxiliar.getProx();
                    ref.setAnterior(null);
                    this.tamanho--;
                    System.out.println("\n - "+elemento+" REMOVIDO COM SUCESSO!\n");
                    break;
                }
                //caso o elemento seja a referência e não haja nenhum elemento sucessor.
                else if(auxiliar == this.ref){
                    this.ref = null;
                        System.out.println("\n - "+elemento+" REMOVIDO COM SUCESSO!\n");
                    this.tamanho--;
                    break;
                }
                //caso não seja a referência.
                else {
                    anterior.setProx(auxiliar.getProx());
                    if(anterior.getProx() != null){
                        anterior.getProx().setAnterior(anterior);
                    }
                    System.out.println("\n - "+elemento+" REMOVIDO COM SUCESSO!\n");
                    this.tamanho--;
                    break;
                    }
                }
            anterior = auxiliar;
        }
    }

    // * Esvazia a Lista Dupla |
    public void esvaziar(){
        //transforma a referência em nulo, apagando os nós sucessores.
        this.ref = null;
        this.tamanho = 0;
        System.out.println("\n - A LISTA FOI ESVAZIADA\n");
    }
    
    // * Buscar Elemento na Lista Dupla |
    public void buscar(long elemento){
        int posicao = 0;
        if(listaVazia()){
            try {
                throw new Exception("[ BUSCAR: LISTA VAZIA! ]");
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
        //percorre os nós, por meio de uma variável auxiliar do tipo No até encontrar o nulo.
        for(No auxiliar = this.ref; auxiliar != null; auxiliar = auxiliar.getProx()){
            posicao++;
            //caso a informação do No seja igual ao elemento, retorna para o usuário o elemento, posição, anterior e sucessor.
            if(auxiliar.getInfo() == elemento){
                if(auxiliar.getProx() == null & auxiliar.getAnterior() != null){
                    System.out.println("\n ANTERIOR: ["+auxiliar.getAnterior().getInfo()+"]\n ELEMENTO: ["+auxiliar.getInfo()+"]\n PROXIMO:  ["+null+"]"+"\n POSICAO:   "+posicao+"\n");
                }
                else if(auxiliar.getAnterior() == null & auxiliar.getProx() != null){
                    System.out.println("\n ANTERIOR: ["+null+"]\n ELEMENTO: ["+auxiliar.getInfo()+"]\n PROXIMO:  ["+auxiliar.getProx().getInfo()+"]"+"\n POSICAO:   "+posicao+"\n");
                }
                else if(auxiliar.getAnterior() == null & auxiliar.getProx() == null){
                    System.out.println("\n ANTERIOR: ["+null+"]\n ELEMENTO: ["+auxiliar.getInfo()+"]\n PROXIMO:  ["+null+"]"+"\n POSICAO:   "+posicao+"\n");
                }
                else{
                    System.out.println("\n ANTERIOR: ["+auxiliar.getAnterior().getInfo()+"]\n ELEMENTO: ["+auxiliar.getInfo()+"]\n PROXIMO:  ["+auxiliar.getProx().getInfo()+"]"+"\n POSICAO:   "+posicao+"\n");
                }
                break;
            }
            //caso o elemento não esteja inserido na lista, retorna mensagem para o usuário.
            else if(auxiliar.getProx() == null & auxiliar.getInfo() != elemento){
                try {
                    throw new Exception("[ BUSCAR: ELEMENTO NÃO EXISTENTE! ]");
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
            }
        }
    }

    // * Imprime Elementos na Lista Dupla em ambos os sentidos |
    public void imprimir(){
        String listaVai = " ";
        String listaVolta = " ";
        //retorna mensagem para o usuário, em caso de lista vazia.
        if(listaVazia()){
            try {
                throw new Exception("[ IMPRIMIR: LISTA VAZIA! ]");
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
        //percorre os nós, por meio de uma variável auxiliar do tipo No até encontrar o nulo.
        for(No auxiliarVai = this.ref; auxiliarVai != null; auxiliarVai = auxiliarVai.getProx()){
            //caso a próxima variável seja nula irá executar o outro laço
            if(auxiliarVai.getProx() == null){
                listaVai += "["+auxiliarVai.getInfo()+"]";
                //percorre os nós no sentido contrário, do fim ao início, por meio da busca pelo anterior.
                for(No auxiliarVolta = auxiliarVai; auxiliarVolta != null; auxiliarVolta = auxiliarVolta.getAnterior()){
                    if(auxiliarVolta.getAnterior() !=  null){
                        listaVolta += "["+auxiliarVolta.getInfo()+"] <- ";
                    }
                    else{
                        listaVolta += "["+auxiliarVolta.getInfo()+"]";
                    }
                }
                return;
            }
            listaVai += "["+auxiliarVai.getInfo()+"] -> ";
        }
        //impressão das variáveis com todos os elementos inseridos, em ambos os sentidos.
        System.out.println("\n"+listaVai);
        System.out.println("\n IMPRESSÃO NO SENTIDO CONTRÁRIO [FIM -> INICIO]:\n\n"+listaVolta);
        System.out.println(" - Tamanho da Lista: "+this.tamanho+"\n");
    }

}
