public class CalculadoraDemo {
  public static void main(String[] args) {
    System.out.print("Soma = ");
    System.out.println(Calculadora.soma(5, 3.2)); //converte os valores de acordo com o tipo, na outra classe declara das duas formas (int e double)
     
    System.out.print("Subtracao = ");
    System.out.println(Calculadora.subtracao(3, 1));
     
    System.out.print("Divisao = ");
    System.out.println(Calculadora.divisao(5.1,17));
     
    System.out.print("Multiplicacao = ");
    System.out.println(Calculadora.multiplicao(2, 7));
  }
}