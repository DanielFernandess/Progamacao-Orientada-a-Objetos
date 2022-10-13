public class Lampada {
  //private: Apenas a própria classe que implementa o método tem acesso a este método.
  //boolean podem assumir os valores true ou false
  private boolean estadoDaLampada; 
  private Contador cont = new Contador(); //encapsulado privado chamando contador
  
  //funcao para acender a lampada
  public void acende(){ //public:Todas as classes de qualquer pacote pode ter acesso a este método.
    if(!estaLigada()){ //ao contrario
      this.estadoDaLampada = true; 
        this.cont.incrementa();
    }else{
      System.out.println("Lampada já está Ligada");
    }
  }
  //funcao para apagar lampada
  public void apaga(){
    if(estaLigada()){
      this.estadoDaLampada = !this.estadoDaLampada; 
    }else{
      System.out.println("Lampada já está Apagada");
    }
  }
    
  //funcao para mostrar estado da lampada
  public void mostraEstado(){
    if(estadoDaLampada == true){
      System.out.println("A lampada esta ligado");
    }else{
      System.out.println("A lampada esta desligado");
    }
  }
  //boolean podem assumir os valores true ou false. O valor default para um atributo booleano de uma classe, se não especificado, é false
  public boolean estaLigada(){
    return this.estadoDaLampada;
  }
  //funcao para mostrar as quantidades que acendeu 
  public void QuantidadesDeAcesso(){
    this.cont.imprimi();
  }
}