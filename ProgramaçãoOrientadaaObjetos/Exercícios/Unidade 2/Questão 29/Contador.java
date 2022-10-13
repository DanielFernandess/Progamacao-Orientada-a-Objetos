public class Contador {
  int cont;  
  
  //public: Todas as classes de qualquer pacote pode ter acesso a este método.
  //funcao para incrementar
  public void incrementar(){
    this.cont++;
  }
  //funcao para decrementar
  public void decrementar(){
    this.cont--;
  }
  //funcao para zerar
  public void zerar(){
    this.cont = 0;
  }
  //funcao para imprimir
  public void imprimir(){
    System.out.println("vezes: " + this.cont);
  } 
}