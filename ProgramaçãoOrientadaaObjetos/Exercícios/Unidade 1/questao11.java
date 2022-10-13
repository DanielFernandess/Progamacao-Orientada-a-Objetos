import java.util.Scanner;

public class questao11{

    public static void main(String[] args){
        Scanner ler = new Scanner (System.in);

        int a = 1, b = 0, aux, n;//variaveis.

        System.out.println("Programa de fibonacci!\n");

        System.out.print("Informe um numero (Maior que 0): ");
        n = ler.nextInt(); //lendo o numero.

        for (int i = 0; i < n; i ++){ //sequencia de fibonacci
            //imprimindo passo a passo da sequencia.
            System.out.print(a + " ");//primeira vez q passar vai imprimir 1 = a.
            aux = a; //variavel auxiliar recebe o valor de (a) antes de somar com (b).
            a += b; //variavel (a) somando com (b).
            b = aux; //variavel b sempre ta guardando o numero anterior do atual a.
        }
        ler.close();
    }
}