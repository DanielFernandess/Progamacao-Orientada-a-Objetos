import java.util.Random; //biblioteca para aleatoriedade

public class NumeroComplexoDemo{
  //Static serve para referenciar todos os atributos/métodos de classe, ou seja, que podem ser acessados diretamente da definição da classe, sem precisar instanciar nenhum objeto.
  public static void main(String[] args){
    Random rand = new Random(); //instancia e construtor
    NumeroComplexo numeroComplexo1 = new NumeroComplexo(1, rand.nextInt(10));
    NumeroComplexo numeroComplexo2 = new NumeroComplexo(20);
    NumeroComplexo numeroComplexo3 = new NumeroComplexo();

    System.out.println(numeroComplexo1);
    System.out.println(numeroComplexo2);
    System.out.println(numeroComplexo3);
  }
}