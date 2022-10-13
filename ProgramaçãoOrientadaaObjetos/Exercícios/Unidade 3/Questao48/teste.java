import java.util.InputMismatchException;//import para exceção quando recebe um tipo indesejado.
import java.util.Scanner;

public class teste {
    public static int obterIntValido(){
        Scanner valor = new Scanner(System.in);

        //tratamento de exceção.
        try{//caso ocorra exceção, a execução chama o catch correspondente.
            System.out.print("Digite o numero: ");
            int result = valor.nextInt();//nextInt=lê o valor digitado e armazena em valor.
            return result;
        }
        //exceção: Vlr informado n é interio.
        //Catch=Descreve a ação que ocorrerá caso a exceção aconteça.
        catch (InputMismatchException e){//quando não corresponde ao tipo inteiro.
            System.out.println("Numero não computado!");
            System.out.println("Exceção - Erro: " + e);
            System.out.println("Valor deveria ser inteiro, informe um valor valido");
            return obterIntValido();
        }
    }

    public static void main(String[] args) {
        int numero1 = obterIntValido();
        int numero2 = obterIntValido();

        System.out.print("A soma dos numero inteiros = " + (numero1+numero2));
    }
}