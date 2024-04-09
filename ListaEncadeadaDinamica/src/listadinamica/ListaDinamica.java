package listadinamica;

public class ListaDinamica {
    //nó do começo e nó do final como se fosse uma fila do banco
    
    // 1°) criação da lista
    // --> inicio = null e fim = null
    
    
    //aqui é so referência
    private No inicio;
    private No fim;
    
    public ListaDinamica(){
        this.inicio = null;
        this.fim = null;
        
    }
        
    // 2°) inserir o primeiro elemento   
    public void inserePrimeiroElemento(double valor){
        No aux = new No(valor);
        this.inicio = aux;
        this.fim = aux;
    }
    
    // 3°) Inserir no inicio
    public void insereInicio(double valor){
        No aux = new No(valor);
        aux.setProximo(inicio);
        this.inicio = aux;  //atualizar o inicio
    }
    //inserir no final
    
    public void insereFinal(double valor){
        No aux = new No(valor);
        //ele não se liga, fazer atualização | não tem ninguem depois dele
        this.fim.setProximo(aux); //fim prox aux  
        this.fim = aux; //atual
    }
    //estrutura 1) No; 2) Lista; 3) Programa
    
    public void insereMeio(double valor, int pos){
        No aux = this.inicio; //aux na pos do primeiro
        
        //como sabe o quanto vai repetir então usa for
        for(int i = 1; i < pos; i++){
            aux = aux.getProximo(); //aux vai guardar na posição como se fosse um x 
        }
        No novo = new No(valor); //criar no, depois ligações do novo elemento sem desmontar as ligações ja existente
        novo.setProximo(aux.getProximo()); //proximo de x é proximo de y
        aux.setProximo(novo);
    }
    
    public boolean ehVazia(){
        return ((this.inicio == null) && (this.fim == null)); //não deixar de remover um elemento em uma lista vazia
    }
    
    public int tamanho(){
        int tamanho = 0; 
        No aux = this.inicio;
        while(aux != null){
            tamanho ++;
            aux = aux.getProximo();
        }
        return tamanho;
    }
    
    public void insere(double valor){
        if (ehVazia()){
            inserePrimeiroElemento(valor);
        }else {
            insereFinal(valor);
        }
    }
    
    public void removeMeio(int pos){
        No aux = this.inicio;
        for (int i = 1; i < pos; i++){
            aux = aux.getProximo();
        }
        No prox = aux.getProximo();
        aux.setProximo(prox.getProximo());
        prox = null;
    }
    public void removeInicio(){
        No aux = this.inicio;
        this.inicio = aux.getProximo();
        aux = null;
    }
    
    public void removeFinal(){
        No aux = this.inicio;
        for (int i = 1; i < tamanho()-1; i++){
            aux = aux.getProximo();
        }
        No prox = aux.getProximo();
        aux.setProximo(null);
        this.fim = aux;
        prox = null;
    }
    
    //começa no inicio e vai até que o proximo é null
    public void imprimir(){
        No aux = this.inicio; 
        
            while(aux != null){
                System.out.println(aux.getValor());
                aux = aux.getProximo();
            }
    }
}
//metodo de remoção para todos os inseres