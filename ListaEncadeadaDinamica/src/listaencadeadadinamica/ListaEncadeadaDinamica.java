package listaencadeadadinamica;

import listadinamica.ListaDinamica;

public class ListaEncadeadaDinamica {

    public static void main(String[] args) {
        ListaDinamica lista = new ListaDinamica();
        
        lista.inserePrimeiroElemento(76);
        lista.insereInicio(3);
        lista.insereInicio(456);
        lista.insereFinal(8);
        lista.insereMeio(20, 2);
        lista.imprimir();
        
        System.out.println("---------------------------");
        
        
        lista.removeMeio(2);
        lista.removeInicio();
        lista.removeFinal();
        lista.imprimir();
    }
    //unifiquem os metodos de inserção e remoção
}
