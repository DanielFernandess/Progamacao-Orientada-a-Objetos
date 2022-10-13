public class Elevador {
  int andar, quantidadeDeAndares, capacidadeElevador, quantidadeDePessoasPresente;
  //funcao para inicializar o elevador//
  void inicializa(int capacidadeElevador, int qtdAndares){
    this.capacidadeElevador = capacidadeElevador; //referencia da propria instancia//
    this.quantidadeDeAndares = qtdAndares;
    this.andar = 0;
  }
  //funcao para entrar no elevador
  void entra(){
    if(this.capacidadeElevador > this.quantidadeDePessoasPresente){
      this.quantidadeDePessoasPresente++;
    }else{
      System.out.println("Numero excede limite maximo de pessoas");
    }
  }
  //funcao para sair do elevador
  void sai(){
    if(this.quantidadeDePessoasPresente > 0){
      this.quantidadeDePessoasPresente--;
    }
  }
  //funcao para subir de andar no elevador
  void sobe(){
    if(this.quantidadeDeAndares == this.andar){
      System.out.println("Não da pra subir mais");
    }else{
      this.andar++;
    }
  }
  //funcao para descer andar no elevador//
  void desce(){
    if(this.andar == 0){
      System.out.println("Não é possivel descer mais");
    }else{
      this.andar--;
    }
  }
  //função para mostrar status do elevador//
  void mostrarStatusDoElevador(){
    System.out.println("Andar atual: "+this.andar);
    System.out.println("Numero de andares: "+this.quantidadeDeAndares);
    System.out.println("Capacidade do elevador: "+this.capacidadeElevador);
    System.out.println("Pessoa(s) presente(s): "+this.quantidadeDePessoasPresente);
  }
}