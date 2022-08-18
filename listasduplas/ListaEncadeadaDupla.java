package listasduplas;
/**
 * ListaEncadeadaDupla
 */
public class ListaEncadeadaDupla {
    
    private No ref;
    private int tamanho;

    public ListaEncadeadaDupla(){
        
    }

    //Verifica se a lista está vazia |
    public boolean ListaVazia(){    
        return this.ref == null;
    }

    //Insere Elemento na Lista Dupla |
    public void Inserir(int elemento){
        No novo = new No(elemento, null,this.ref);
        if(ListaVazia() == false){
            this.ref.setAnterior(novo);
        }
        this.ref = novo;
        this.tamanho++;
    }

    //Remove Elemento na Lista Dupla |
    public void Remover(int elemento){
        No anterior = null;
        for(No auxiliar = ref; auxiliar != null; auxiliar = auxiliar.getProx()){
            if(auxiliar.getInfo() == elemento){    
                if(auxiliar == this.ref & this.ref.getProx() != null){
                    ref = auxiliar.getProx();
                    ref.setAnterior(null);
                    this.tamanho--;
                    System.out.println("\n - "+elemento+" removido com sucesso!");
                    break;
                } 
                else if(auxiliar == this.ref){
                    this.ref = null;
                    System.out.println("\n - "+elemento+" removido com sucesso!");
                    this.tamanho--;
                    break;
                }
                else {
                    anterior.setProx(auxiliar.getProx());
                    if(anterior.getProx() != null){
                        anterior.getProx().setAnterior(anterior);
                    }
                    System.out.println("\n - "+elemento+" removido com sucesso!");
                    this.tamanho--;
                    break;
                }
            }
            else if(auxiliar.getProx() == null & auxiliar.getInfo() != elemento){
                System.out.println("\n [ REMOVER: ELEMENTO NÃO EXISTENTE! ]");
            }
            anterior = auxiliar;
        }
    }

    //Esvazia a Lista Dupla |
    public void Esvaziar(){
        this.ref = null;
        this.tamanho = 0;
        System.out.println("\n - A Lista foi Esvaziada");
    }
    
    //Buscar Elemento na Lista Dupla |
    public void Buscar(int elemento){
        int posicao = 0;
        for(No auxiliar = this.ref; auxiliar != null; auxiliar = auxiliar.getProx()){
            posicao++;
            if(auxiliar.getInfo() == elemento){
                if(auxiliar.getProx() == null & auxiliar.getAnterior() != null){
                    System.out.println("\n ANTERIOR: ["+auxiliar.getAnterior().getInfo()+"]\n ELEMENTO: ["+auxiliar.getInfo()+"]\n PROXIMO:  ["+null+"]"+"\n POSICAO:   "+posicao);
                }
                else if(auxiliar.getAnterior() == null & auxiliar.getProx() != null){
                    System.out.println("\n ANTERIOR: ["+null+"]\n ELEMENTO: ["+auxiliar.getInfo()+"]\n PROXIMO:  ["+auxiliar.getProx().getInfo()+"]"+"\n POSICAO:   "+posicao);
                }
                else if(auxiliar.getAnterior() == null & auxiliar.getProx() == null){
                    System.out.println("\n ANTERIOR: ["+null+"]\n ELEMENTO: ["+auxiliar.getInfo()+"]\n PROXIMO:  ["+null+"]"+"\n POSICAO:   "+posicao);
                }
                else{
                    System.out.println("\n ANTERIOR: ["+auxiliar.getAnterior().getInfo()+"]\n ELEMENTO: ["+auxiliar.getInfo()+"]\n PROXIMO:  ["+auxiliar.getProx().getInfo()+"]"+"\n POSICAO:   "+posicao);
                }
                break;
            }
            else if(auxiliar.getProx() == null & auxiliar.getInfo() != elemento){
                System.out.println("\n [ BUSCAR: ELEMENTO NÃO EXISTENTE! ]");
            }
        }
    }

    //Imprime Elementos na Lista Dupla em ambos os sentidos |
    public void Imprimir(){
        String listaVai = " ";
        String listaVolta = " ";
        if(ListaVazia()){
            System.out.println("\n [ LISTA VAZIA! ]");
        }
        else{
            for(No auxiliarVai = this.ref; auxiliarVai != null; auxiliarVai = auxiliarVai.getProx()){
                if(auxiliarVai.getProx() == null){
                    listaVai += "["+auxiliarVai.getInfo()+"]";
                    for(No auxiliarVolta = auxiliarVai; auxiliarVolta != null; auxiliarVolta = auxiliarVolta.getAnterior()){
                        if(auxiliarVolta.getAnterior() !=  null){
                            listaVolta += "["+auxiliarVolta.getInfo()+"] <- ";
                        }
                        else{
                            listaVolta += "["+auxiliarVolta.getInfo()+"]";
                        }
                    }
                }
                else{
                    listaVai += "["+auxiliarVai.getInfo()+"] -> ";
                }
            }
            System.out.println("\n"+listaVai);
            System.out.println("\n IMPRESSÃO NO SENTIDO CONTRÁRIO [FIM -> INICIO]:\n\n"+listaVolta);
            System.out.println(" - Tamanho da Lista: "+this.tamanho);
        }
    }

}
