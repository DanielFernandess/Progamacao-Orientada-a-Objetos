public class MaiorValor {

//public static = Compartilhados por todas as instâncias dessa classe, Somente um valor é armazenado em um campo estático.
//Caso esse valor seja modificado por uma instância, a modificação será refletida às outras.
//armazenar valores que não serão modificados nem serão variáveis por instâncias de classe.
  
//funcao q faz as comparacoes int do numero 1 e 2
  public static int maior(int numero1, int numero2){
    if (numero1 > numero2){
      return numero1;
    }else{
      return numero2;
    }
  }
  //funcao q faz as comparacoes int do numero 1, 2 e 3
  public static int maior(int numero1, int numero2, int numero3){
    if(numero1>numero2 && numero1 >numero3){
      return numero1;
    }else if (numero2 > numero3){
      return numero2;
    }else{
      return numero3;
    }
  }
  //funcao q faz as comparacoes int do numero 1, 2, 3 e 4
  public static int maior(int numero1, int numero2, int numero3, int numero4){
    
    if(numero1 > numero2 && numero1 > numero3 && numero1 > numero4){
      return numero1;
    }else if (numero2 > numero3 && numero2>numero4){
      return numero2;
    }else if(numero3 > numero4){
      return numero3;
    }else{
     return numero4;
    }
  }
  //funcao q faz as comparacoes int do numero 1,2,3,4 e 5
  public static int maior(int numero1, int numero2, int numero3, int numero4, int numero5){
    
    if(numero1 > numero2 && numero1 > numero3 && numero1 > numero4){
      return numero1;
    }else if (numero2 > numero3 && numero2 > numero4){
      return numero2;
    }else if(numero3 > numero4){
      return numero3;
    }else if(numero4 > numero5){
      return numero4;
    }else{
      return numero5;
    }
  }  
  //funcao q faz as comparacoes double do numero 1 e 2
  public static double maior(double numero1, double numero2){
    if (numero1 > numero2){
      return numero1;
    }else{
      return numero2;
    }
  }
  //funcao q faz as comparacoes double do numero 1, 2 e 3
  public static double maior(double numero1, double numero2, double numero3){
    if(numero1>numero2 && numero1 >numero3){
      return numero1;
    }else if (numero2 > numero3){
      return numero2;
    }else{
      return numero3;
    }
  }
  //funcao q faz as comparacoes double do numero 1, 2, 3 e 4
  public static double maior(double numero1, double numero2, double numero3, double numero4){
    if(numero1 > numero2 && numero1 > numero3 && numero1 > numero4){
      return numero1;
    }else if (numero2 > numero3 && numero2>numero4){
      return numero2;
    }else if(numero3 > numero4){
      return numero3;
    }else{
     return numero4;
    }
  }
  //funcao q faz as comparacoes double do numero 1, 2, 3, 4 e 5
  public static double maior(double numero1, double numero2, double numero3, double numero4, double numero5){
    if(numero1 > numero2 && numero1 > numero3 && numero1 > numero4){
      return numero1;
    }else if (numero2 > numero3 && numero2 > numero4){
      return numero2;
    }else if(numero3 > numero4){
      return numero3;
    }else if(numero4 > numero5){
      return numero4;
    }else{
      return numero5;
    }
  }
}