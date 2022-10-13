import java.util.Scanner;

public class questao01{

    public static void main(String[] args){
        Scanner ler = new Scanner (System.in);
        
        //variaveis 
        int lado;
        int area;
        int perimetro;

        System.out.println("Programa para calcular a area do quadrado!\n");

        System.out.print("Informe o lado do quadrado: ");
        lado = ler.nextInt();
        
        //calculo para saber o perimetro e area
        area = lado * lado;
        perimetro = lado * 4;

        System.out.println("Area do quadrado = " + area);
        System.out.println("Perimetro do quadrado = " + perimetro);

        ler.close();
    }
}