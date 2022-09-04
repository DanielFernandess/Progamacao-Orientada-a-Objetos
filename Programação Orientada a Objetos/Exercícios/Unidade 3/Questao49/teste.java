import java.util.InputMismatchException;//import para exceção quando recebe um tipo indesejado
import java.util.Scanner;

public class teste{
    public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
      //vetor com os nomes dos meses do ano.
      String[] meses = { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" };      

        //tratamento de exceção.
        try{//caso ocorra algum problema, vai chamar o catch correspondente a exceção .
          System.out.print("Digite o numero correspondente ao mes: ");
          int numeroMes = scanner.nextInt();//nextInt = lê o valor digitado e armazena em numeroMes.
          System.out.println(meses[numeroMes-1]);
          scanner.close();//fechando scanner.
        }
        //exceção: Vlr informado é alem do tamanho do array.
        //Catch=Descreve a ação que ocorrerá caso a exceção aconteça.
        catch(ArrayIndexOutOfBoundsException e){//quando fornecido um índice fora dos limites permitidos do array.
            System.out.println("Exceção: " + e);
            System.out.println("Valor informado excede o limite de '12' meses");
        }
        //exceção: Entrada n é inteiro.
        catch(InputMismatchException e){//quando não corresponde ao tipo inteiro.
            System.out.println("Exceção: " + e);
            System.out.println("Valor digitado deveria ser inteiro");
        }finally{//Garante que o código seja executado após um try, mesmo havendo exceção, sucesso ou falha.
            scanner.close();
        }
    }
}