//herdando metodos. Herança.
//classe filha da classe datahora.
public class eventoHeranca extends dataHora{
  private String evento;
  
  //'super' atua como uma variável de referência para os objetos da classe pai.
  eventoHeranca(){
    super(); //Chama os métodos e variáveis ​​da classe do pai.
    this.evento = "HERANÇA";
  }

  eventoHeranca(dataHora dataHora, String evento){
    super(dataHora.getHorario(), dataHora.getData());
    this.evento = evento;
  }
  //get - obter informações.
  public String getEvento() {
    return this.evento;
  }
  //set - definir valores.
  public void setEvento(String evento) {
    this.evento = evento;
  }

  public String toString() {
    return "EVENTO " + this.evento + ": { " + this.getData() + ", " + this.getHorario() +" }";
  }
}