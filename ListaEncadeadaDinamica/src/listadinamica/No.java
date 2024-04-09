package listadinamica;

public class No {
    private double valor;  
    private No proximo;
    
    public No(double valor){
        this.valor = valor;     //contrutor 
        this.proximo = null;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }
}
