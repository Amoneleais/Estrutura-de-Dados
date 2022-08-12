package listasduplas;

public class ListaDupla {
    
    private No ref;
    private int tamanho;

    public ListaDupla(){
        
    }

    //Verifica se a lista está vazia
    public boolean ListaVazia(){    
        return this.ref == null;
    }

    //Insere Elemento na Lista Dupla
    public void Inserir(int elemento){
        if(ListaVazia()){
            No novo = new No(elemento, null,this.ref);
            this.ref = novo;
            this.tamanho++;
        }
        else{
            No novo = new No(elemento, null,this.ref);
            this.ref.setAnterior(novo);
            this.ref = novo;
            this.tamanho++;  
        }
    }

    //Remove Elemento na Lista Dupla
    public void Remover(int info){
        No anterior = null;
        for(No auxiliar = ref; auxiliar != null; auxiliar = auxiliar.getProx()){
            if(auxiliar.getInfo() == info){    
                if(auxiliar == this.ref & this.ref.getProx() != null){
                    ref = auxiliar.getProx();
                    ref.setAnterior(null);
                    this.tamanho--;
                    System.out.println(" \n"+info+" removido com sucesso!");
                    break;
                } 
                else if(auxiliar == this.ref){
                    this.ref = null;
                    System.out.println(" \n"+info+" removido com sucesso!");
                }
                else {
                    anterior.setProx(auxiliar.getProx());
                    if(anterior.getProx() != null){
                        anterior.getProx().setAnterior(anterior);
                    }
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

    public void Esvaziar(){
        ref = null;
        tamanho = 0;
        System.out.println("\n A Lista foi Esvaziada");
    }
    
    //Buscar Elemento na Lista Dupla
    public void Buscar(int info){
        int posicao = 0;
        for(No auxiliar = this.ref; auxiliar != null; auxiliar = auxiliar.getProx()){
            posicao++;
            if(auxiliar.getInfo() == info){
                System.out.println("\n ANTERIOR: ["+auxiliar.getAnterior().getInfo()+"]\n ELEMENTO: ["+auxiliar.getInfo()+"]\n PROXIMO:  ["+auxiliar.getProx().getInfo()+"]"+"\n POSICAO:   "+posicao);
                break;
            }
            else if(auxiliar.getProx() == null & auxiliar.getInfo() != info){
                System.out.println("\n [ BUSCAR: ELEMENTO NÃO EXISTENTE! ]");
            }
        }
    }

    //Imprime Elementos na Lista Dupla em ambos os sentidos
    public void Imprimir(){
        String lista = " ";
        String listaVolta = " ";
        if(ListaVazia()){
            System.out.println("\n [ LISTA VAZIA! ]");
        }
        else{
            for(No auxiliar = this.ref; auxiliar != null; auxiliar = auxiliar.getProx()){
                lista += "["+auxiliar.getInfo()+"] ";
                if(auxiliar.getProx()==null){
                    for(No auxiliar_reverso = auxiliar; auxiliar_reverso != null; auxiliar_reverso = auxiliar_reverso.getAnterior()){
                        listaVolta += "["+auxiliar_reverso.getInfo()+"] ";
                    }
                }
            }
            System.out.println("\n"+lista);
            System.out.println("\n BUSCANDO NO SENTIDO CONTRÁRIO [FIM -> INICIO]:\n\n"+listaVolta);
            System.out.println(" Tamanho da Lista: "+this.tamanho);
        }

    }
}
