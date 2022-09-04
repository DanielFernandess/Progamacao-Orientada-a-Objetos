import java.util.Scanner;

public class questao06{

    public static void main(String[] args){
        Scanner ler = new Scanner (System.in);

        //variaveis.
        int numero, dia, hora, minuto, resto;

        System.out.println("Programa para transformar numero em dias, horas e minutos!\n");

        System.out.print("Informe o numero: ");
        numero = ler.nextInt();

        //codigo do programa
        dia = numero / 1440; //divide por 1440 pq 1 dia tem esse valor em minutos.
        resto = numero % 1440; //o resto do numero vai para a variavel resto.
        hora = resto / 60;  //divide por 60 pois 1 hora tem 60 minutos.
        minuto = resto % 60; // o resto do valor q sobra é os minutos.

        //mostrando vlr.
        System.out.println("Convertendo da = " + dia + " dia(s): " + hora +" hora(s): "+ minuto + " minuto(s)");

        ler.close();
    }
}