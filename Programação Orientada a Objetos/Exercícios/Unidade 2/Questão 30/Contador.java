public class Contador {
    private int cont; //private: Apenas a própria classe que implementa o método tem acesso a este método.

    //funcao para incrementar o contador
    public void incrementa(){ //public: Todas as classes de qualquer pacote pode ter acesso a este método.
        this.cont++; 
    }
    //funcao para decrementar o contador
    public void decrementa(){
        this.cont--;
    }
    //funcao para zerar o contador
    public void zera(){
        this.cont = 0;
    }
    //funcao para imprimir a quantidade de vezes
    public void imprimi(){
        System.out.println("Vezes " + this.cont);
    }
}
