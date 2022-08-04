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
                System.out.println("\n=======      !ERRO!      =======");
                System.out.println("     !ELEMENTO INEXISTENTE!     ");
                System.out.println("======== ============== ========");
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
                System.out.println("\n=======      ERRO!      =======");
                System.out.println("        !NÃO EXISTENTE!        ");
                System.out.println("======= =============== =======");
            }
        }
    }

    //Imprime os infos da Lista Encadeada
    public void Imprimir(){
        String lista = " [ ";
        if(ListaVazia()){
            System.out.println("\n=======      ERRO!      =======");
            System.out.println("         !LISTA VAZIA!         ");
            System.out.println("======= =============== =======");
        }
        else{
            for(No auxiliar = this.ref; auxiliar != null; auxiliar = auxiliar.getProx()){
                if(auxiliar.getProx()==null){
                    lista += auxiliar.getInfo()+" ]";
                }
                else{
                    lista += auxiliar.getInfo()+", ";
                }
            }
            System.out.println("\n======= Lista Encadeada =======");
            System.out.println(lista);
            System.out.println(" Tamanho da Lista: "+tamanho);
            System.out.println("======= =============== =======");
        }
    }
    
}
