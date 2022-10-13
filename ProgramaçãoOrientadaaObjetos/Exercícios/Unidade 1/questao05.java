import java.util.Scanner;

public class questao05{

    public static void main(String[] args){
        Scanner ler = new Scanner (System.in);

        //variaveis.
        int numero;
        int inverso = 0;
        int manter, lembrar;

        System.out.println("Programa para inverter o ultimo numero com o primeiro!\n");

        System.out.print("Informe um numero: ");
        numero = ler.nextInt();

        //guardando numero para mostrar no final.
        manter = numero;

        //enquanto o numero for > 0 vai rodar.
        for (;numero >0;){ //informando somente o valor minimo da variavel numero
            lembrar = numero %10; //lembrar recebe o resto da divição de numero por 10.
            inverso = inverso * 10 + lembrar; //a cada repetição, a variavel inverso recebe seu proprio vlr * 10 + vlr de lembrar.
            numero /= 10; //numero recebe seu proprio vlr dividido por 10.
        }

        //mostrando numero digitado  e numero ao contrario.
        System.out.println("Numero original = " + manter);
        System.out.println("\n");
        System.out.println("Numero modificado = " + inverso);

        ler.close();
    }
}