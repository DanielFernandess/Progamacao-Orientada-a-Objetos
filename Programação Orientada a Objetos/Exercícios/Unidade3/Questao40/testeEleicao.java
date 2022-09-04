public class testeEleicao {
    public static void main(String[] args){
      
      prefeito prefeito = new prefeito(new pessoa("Carlos Daniel", 21), "PDF", "Apodi", "RN");
      System.out.println(prefeito);
  
      governador governador = new governador(new pessoa("Alan Silveira", 52), "PDF", "Natal", "RN");
      System.out.println(governador);
    }
  }