package listasduplas;

public class ListaDupla {
    
    private No ref;
    private int tamanho;

    public ListaDupla(){
        
    }

    //Verifica se a lista está vazia
    public boolean ListaVazia(){    
        return ref == null;
    }

    //Insere Elemento na Lista Dupla
    public void Inserir(int elemento){
        if(ref == null){
            No novo = new No(elemento, null, ref);
            ref = novo;
            tamanho++;
        }
        else{
            No novo = new No(elemento, null, ref);
            ref.setAnterior(novo);
            ref = novo;
            tamanho++;  
        }
    }

    //Remove Elemento na Lista Dupla
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
    
    //Buscar Elemento na Lista Dupla
    public void Buscar(int info){
        for(No auxiliar = this.ref; auxiliar != null; auxiliar = auxiliar.getProx()){
            if(auxiliar.getInfo() == info){
                System.out.println("\n ANTERIOR: ["+auxiliar.getAnterior().getInfo()+"]\n ELEMENTO: ["+auxiliar.getInfo()+"]\n PROXIMO:  ["+auxiliar.getProx().getInfo()+"]");
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
            System.out.println("\n BUSCANDO O ANTERIOR:\n\n"+listaVolta);
            System.out.println(" Tamanho da Lista: "+tamanho);
        }

    }
}
