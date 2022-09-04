public class ContadorDemo {
  //Static serve para referenciar todos os atributos/métodos de classe, ou seja, que podem ser acessados diretamente da definição da classe, sem precisar instanciar nenhum objeto.
  public static void main(String[] args) {
    Contador cont = new Contador(); //instanica e constutor
    //incrementando 2 vzs
    cont.incrementar();
    cont.incrementar();
    
    //imprimindo vlr de cont
    cont.imprimir();
    //decrementando 1
    cont.decrementar();
    //imprimendo vlr de cont
    cont.imprimir();
    //zerando cont
    cont.zerar();
    //imprimendo vlr de cont
    cont.imprimir();
  }
}