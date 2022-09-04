import java.util.Scanner;

public class questao03{//programa semi feito, falta os outros recsitos, so transforma de graus para radiano

    public static void main(String[] args){
        Scanner ler = new Scanner (System.in);
        
        //variaveis.
        float graus, radianos;

        System.out.println("Programa para transformar graus em radianos!\n");

        System.out.print("Informe o numero: ");
        graus = ler.nextFloat();
        
        //calculo para transformar graus em radianos.
        radianos = (float) (3.14 * graus / 180);

        System.out.println("O valor em radianos eh  = " + radianos);

        ler.close();
    }
}