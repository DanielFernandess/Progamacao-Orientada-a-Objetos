public class LampadaDemo {
  //Static serve para referenciar todos aqueles atributos/métodos de classe, ou seja, que podem ser acessados diretamente da definição da classe, sem precisar instanciar nenhum objeto.
  public static void main(String[] args) {
    Lampada lampada = new Lampada(); //instancia e construtor
    //acende a lampada
    lampada.acende();
    //mostra estado da lampada
    lampada.mostraEstado();
    //apaga a lampada
    lampada.apaga();
    //mostra estado da lampada
    lampada.mostraEstado();
    //acende a lampada
    lampada.acende();
    //mostra estado da lampada = ligada
    lampada.mostraEstado();
    //mostra as quantidade que acendeu = 2vzs
    lampada.QuantidadesDeAcesso();
  }
}