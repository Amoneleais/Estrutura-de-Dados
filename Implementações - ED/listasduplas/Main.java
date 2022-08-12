package listasduplas;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        ListaDupla Lista = new ListaDupla();

        //1 - Lista Vazia |
 
        System.out.println("\nLista Vazia: "+Lista.ListaVazia());

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

        //3 - Utilizando Impressão |

        Lista.Imprimir();

        //4 - Utilizando Remoção de Elementos Existentes/Inexistentes |

        Lista.Remover(32);
        Lista.Remover(30);
        Lista.Remover(1);
        Lista.Remover(20);
        Lista.Remover(20);
        Lista.Remover(10);

        Lista.Imprimir();

        //5 - Utilizando Busca |

        Lista.Buscar(200);
        Lista.Buscar(55);
        Lista.Buscar(20);

        //6 - Lista Vazia depois de Inserções |

        System.out.println("\nLista Vazia: "+Lista.ListaVazia());

        //7 - Esvaziando Lista |

        Lista.Esvaziar();

        Lista.Imprimir();

        //8 - Inserções após esvaziar |

        Lista.Inserir(10);
        Lista.Inserir(20);
        Lista.Inserir(5);

        Lista.Imprimir();

        //9 - Removendo Todos os elementos um por um |
  
        Lista.Remover(10);
        Lista.Remover(20);
        Lista.Remover(5);

        Lista.Imprimir();

    }
}