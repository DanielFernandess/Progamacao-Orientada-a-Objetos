public class Calculadora {
  
  //A Object é a classe pai de todas as classes do java. Ou seja todas as outras classes são subclasses da classe Objec
  //altomaticamente atribui a estrutura de erança para toda a classe
  
  //Static serve para referenciar todos os atributos/métodos de classe, ou seja, que podem ser acessados diretamente da definição da classe, sem precisar instanciar nenhum objeto.
  public static double soma(Object n1, Object n2){//n declara o tipo 
    if((n1 instanceof Integer) && ((n2 instanceof Integer))){ //instanceof = verificar o tipo e transforma em inteiro
      return ((Integer) n1 + (Integer) n2); //interger = int
    }else if((n1 instanceof Integer) && (n2 instanceof Double)){
      return ((Integer) n1 + (Double) n2);
    }else if((n1 instanceof Double) && (n2 instanceof Integer)){
      return ((Double) n1 + (Integer) n2);
    }else if ((n1 instanceof Double) && (n2 instanceof Double)){
      return ((Double) n1 + (Double) n2);
    }else{
      System.out.println("Variavel não permitida");
      return 0;
    }
  }
  
  public static double subtracao(Object n1, Object n2){
    if((n1 instanceof Integer) && ((n2 instanceof Integer))){
      return ((Integer) n1 - (Integer) n2);
    }else if((n1 instanceof Integer) && (n2 instanceof Double)){
      return ((Integer) n1 - (Double) n2);
    }else if((n1 instanceof Double) && (n2 instanceof Integer)){
      return ((Double) n1 - (Integer) n2);
    }else if ((n1 instanceof Double) && (n2 instanceof Double)){
      return ((Double) n1 - (Double) n2);
    }else{
      System.err.println("Variavel não permitida");
      return 0;
    }
  }
  
  public static double divisao(Object n1, Object n2){
    if((n1 instanceof Integer) && ((n2 instanceof Integer))){
      return ((Integer) n1 / (Integer) n2);
    }else if((n1 instanceof Integer) && (n2 instanceof Double)){
      return ((Integer) n1 / (Double) n2);
    }else if((n1 instanceof Double) && (n2 instanceof Integer)){
      return ((Double) n1 / (Integer) n2);
    }else if ((n1 instanceof Double) && (n2 instanceof Double)){
      return ((Double) n1 / (Double) n2);
    }else{
      System.err.println("Variavel não permitida");
      return 0;
    }
  }
  
  public static double multiplicao(Object n1, Object n2){
    if((n1 instanceof Integer) && ((n2 instanceof Integer))){
      return ((Integer) n1 * (Integer) n2);
    }else if((n1 instanceof Integer) && (n2 instanceof Double)){
      return ((Integer) n1 * (Double) n2);
    }else if((n1 instanceof Double) && (n2 instanceof Integer)){
      return ((Double) n1 * (Integer) n2);
    }else if ((n1 instanceof Double) && (n2 instanceof Double)){
      return ((Double) n1 * (Double) n2);
    }else{
      System.err.println("Variavel não permitida");
      return 0;
    }
  }
}