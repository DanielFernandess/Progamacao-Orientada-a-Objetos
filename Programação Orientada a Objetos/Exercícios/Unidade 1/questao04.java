import java.util.Scanner;

public class questao04{

    public static void main(String[] args){
        Scanner ler = new Scanner (System.in);
        
        //variaveis.
        double C;
        double F;
        
        System.out.println("Programa para converter celsius para fahrenheit!\n");

        System.out.print("Informe a temperatura em graus celsius: ");
        C = ler.nextDouble();

        //calculo para transformar f em c.
        F = C * 1.8 + 32;

        System.out.print("Em Fahrenheit = " + F);
        
        ler.close();
    }
}