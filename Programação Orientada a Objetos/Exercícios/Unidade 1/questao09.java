import java.util.Scanner;

public class questao09{

    public static void main(String[] args){
        Scanner ler = new Scanner (System.in);

        System.out.println("Programa para identificar o segundo ponto informado em relação ao primeiro!\n");

        //variaveis.
        double x1, x2, y1, y2;

        //lendo os pontos.
        System.out.print("Informe X1: ");
        x1 = ler.nextDouble();

        System.out.print("Informe Y1: ");
        y1 = ler.nextDouble();

        System.out.print("Informe X2: ");
        x2 = ler.nextDouble();

        System.out.print("Informe Y2: ");
        y2 = ler.nextDouble();

        System.out.println("\n");

        //casos onde x1 = x2 e/ou y1 = y2.

        if (x1 == x2 && y1 == y2){ // para os 2 pontos iguais
            System.out.println("Os pontos estão na mesma origem\n");
        }else if (y1 == y2){ // cordenadas do x forem iguais
            if(x1 > x2){ // x1 for maior que x2
                System.out.println("Y = Segundo ponto - Esta a ESQUERDA de X = Primeiro ponto\n");
            }else{ //x2 for maior que x1
                System.out.println("Y = Segundo ponto - Esta a DIREITA de X = Primeiro ponto\n");
            }
        }else if(x1 == x2){ //cordenadas do x forem iguais
            if(y1 > y2){ //y1 for maior que y2
                System.out.println("Y = Segundo ponto - Esta ABAIXO de X = Primeiro ponto\n");
            }else{//y2 for maior que y1
                System.out.println("Y = Segundo ponto - Esta ACIMA de X = Primeiro ponto\n");
            }

        //casos onde x1 é diferente de x2 e/ou y1 é deferente de y2 

        }else if (x1 != x2 && y1 != y2){// 4 cordenadas diferentes
            if (x1 < x2 && y1 < y2){ //x1 for menor que x2 e y1 menor que y2
                System.out.println("Y = Segundo ponto - Esta ACIMA e a DIREITA de X = Primeiro ponto\n");
            }else if (x1 > x2 && y1 > y2){//x1 for maior que x2 e y1 maior que y2
                System.out.println("Y = Segundo ponto - Esta ABAIXO e a ESQUERDA de X = Primeiro ponto\n");
            }else{//falta implementar mais casos....
                System.out.println("Ops, falta fzr casos para essas entradas...\n");
            }
        }
        ler.close();
    }
}