import java.util.Scanner;

public class questao02{

    public static void main(String[] args){
        Scanner ler = new Scanner (System.in);

        //variaveis.
        float numero1;
        float numero2;
        float numero3;
        float soma, media;

        System.out.println("Programa para calcular a soma e a media aritmética!\n");
        
        //leitura dos 3 numeros.
        System.out.print("Informe o primeiro valor: ");
        numero1 = ler.nextFloat();

        System.out.print("Informe o segundo valor: ");
        numero2 = ler.nextFloat();

        System.out.print("Informe o terceiro valor: ");
        numero3 = ler.nextFloat();


        //media.
        soma = numero1+numero2+numero3;
        media = soma/3;
        
        System.out.println("Soma = " + soma);
        System.out.println("Media Aretmética = " + media);

        ler.close();
    }
}