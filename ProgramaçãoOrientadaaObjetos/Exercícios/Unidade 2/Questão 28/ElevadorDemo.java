public class ElevadorDemo {
  //Static serve para referenciar todos os atributos/métodos de classe, ou seja, que podem ser acessados diretamente da definição da classe, sem precisar instanciar nenhum objeto.
  public static void main(String[] args) {
    Elevador elevador = new Elevador();
    //inicializando o elevador//
    elevador.inicializa(5,  6);
    //entrando 3 pessoas
    elevador.entra();
    elevador.entra();
    elevador.entra();
    //saindo 2 pessoas
    elevador.sai();
    elevador.sai();
    //subindo 5 andares//
    elevador.sobe();
    elevador.sobe();
    elevador.sobe();
    elevador.sobe();
    elevador.sobe();
    //descendo 4 vezez
    elevador.desce();
    elevador.desce();
    elevador.desce();
    elevador.desce();
    //mostrar status do elevador
    elevador.mostrarStatusDoElevador();
  }
}