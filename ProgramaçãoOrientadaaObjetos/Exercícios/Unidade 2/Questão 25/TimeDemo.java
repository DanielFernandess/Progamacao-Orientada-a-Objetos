public class TimeDemo{
//Static serve para referenciar todos os atributos/métodos de classe, ou seja, que podem ser acessados diretamente da definição da classe, sem precisar instanciar nenhum objeto.
  public static void main(String[] args) {
    Time td = new Time(); //instancia e ao mesmo tempo um construtor
    td.campeonato = "SuperLiga"; //instancia chamando a classe
    td.time = "Brasil";
    td.status(); //chamando a funcao

    td.tecnico = "Daniel";
    td.tecnico();
  
    td.vitoria=(6);
    td.vitoria();
  
    td.derrota=(3);
    td.derrota();
  
    td.empate=(1);
    td.empate();
  }
}