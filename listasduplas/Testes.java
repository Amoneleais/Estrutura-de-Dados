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
 
        System.out.println("\nLista Vazia: "+Lista.ListaVazia());//true

        //2 - Utilizando Inserção |

        Lista.Inserir(10);
        Lista.Inserir(20);
        Lista.Inserir(5);
        Lista.Inserir(1);
        Lista.Inserir(1);
        Lista.Inserir(9);
        Lista.Inserir(55);
        Lista.Inserir(2590);
        Lista.Inserir(70);
        Lista.Inserir(30);
        Lista.Inserir(80);

        //3 - Utilizando Impressão |

        Lista.Imprimir();//80,30,70,2590,55,9,1,1,5,20,10

        //4 - Utilizando Remoção de Elementos Existentes/Inexistentes |

        Lista.Remover(32);//Inexistente
        Lista.Remover(30);
        Lista.Remover(1);
        Lista.Remover(20);
        Lista.Remover(20);//Inexistente
        Lista.Remover(10);

        Lista.Imprimir();//80,70,2590,55,9,1,5

        //5 - Utilizando Busca |

        Lista.Buscar(200);//Inexistente
        Lista.Buscar(55);//Anterior: 2590, Elemento: 55, Prox: 9, Pos: 4
        Lista.Buscar(20);//Inexistente

        //6 - Lista Vazia depois de Inserções |

        System.out.println("\nLista Vazia: "+Lista.ListaVazia());//false

        //7 - Esvaziando Lista |

        Lista.Esvaziar();

        Lista.Imprimir();//Lista Vazia

        //8 - Inserções após esvaziar |

        Lista.Inserir(10);
        Lista.Inserir(20);
        Lista.Inserir(5);

        Lista.Imprimir();//10,20,5

        //9 - Removendo Todos os elementos um por um |
  
        Lista.Remover(10);
        Lista.Remover(20);
        Lista.Remover(5);

        Lista.Imprimir();//Lista Vazia

    }
}