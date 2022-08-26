package listasduplas;
/**
 * Testes
 */
public class Testes {
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        ListaEncadeadaDupla Lista = new ListaEncadeadaDupla();

        //1 - Lista Vazia |
 
        System.out.println("\nLista Vazia: "+Lista.listaVazia());//true

        //2 - Utilizando Inserção |

        Lista.inserir(10);
        Lista.inserir(20);
        Lista.inserir(5);
        Lista.inserir(1);
        Lista.inserir(1);
        Lista.inserir(9);
        Lista.inserir(55);
        Lista.inserir(2590);
        Lista.inserir(70);
        Lista.inserir(30);
        Lista.inserir(80);

        //3 - Utilizando Impressão |

        Lista.imprimir();//80,30,70,2590,55,9,1,1,5,20,10

        //4 - Utilizando Remoção de Elementos Existentes/Inexistentes |

        Lista.remover(32);//Inexistente
        Lista.remover(30);
        Lista.remover(1);
        Lista.remover(20);
        Lista.remover(20);//Inexistente
        Lista.remover(10);

        Lista.imprimir();//80,70,2590,55,9,1,5

        //5 - Utilizando Busca |

        Lista.buscar(200);//Inexistente
        Lista.buscar(55);//Anterior: 2590, Elemento: 55, Prox: 9, Pos: 4
        Lista.buscar(20);//Inexistente

        //6 - Lista Vazia depois de Inserções |

        System.out.println("\nLista Vazia: "+Lista.listaVazia());//false

        //7 - Esvaziando Lista |

        Lista.esvaziar();

        Lista.imprimir();//Lista Vazia

        //8 - Inserções após esvaziar |

        Lista.inserir(10);
        Lista.inserir(20);
        Lista.inserir(5);

        Lista.imprimir();//10,20,5

        //9 - Removendo Todos os elementos um por um |
  
        Lista.remover(10);
        Lista.remover(20);
        Lista.remover(5);

        Lista.imprimir();//Lista Vazia

    }
}