public class teste {
    public static void main(String[] args) {
      desenho desenho1 = new desenho(new circulo(), new quadrado(), 2, 3);
      desenho1.apresenta();
  
      System.out.println();
  
      desenho desenho2 = new desenho(new quadrado(), new triangulo(), 2, 3);
      desenho2.apresenta();
    }
  }