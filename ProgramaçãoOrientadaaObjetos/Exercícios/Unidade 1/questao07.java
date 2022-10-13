import java.util.Scanner;

public class questao07{

    public static void main(String[] args){
        Scanner ler = new Scanner (System.in);
        
        //variaveis.
        int numero, naipe;

        System.out.println("Programa para representar valor da carta!\n");

        System.out.print("Informe um numero: ");
        numero = ler.nextInt();
        System.out.print("\n");

        //menu.
        System.out.println("Informe o naipe: ");
        System.out.println("======MENU=====");
        System.out.println(" 1 = OUROS ====");
        System.out.println(" 2 = PAUS =====");
        System.out.println(" 3 = COPAS ====");
        System.out.println(" 4 = ESPADAS ==");
        System.out.println("===============");
        
        //lendo naipe.
        naipe = ler.nextInt();
        System.out.print("\n");

        //casos do switch para o numero da carta.
        switch(numero){
            case 1:
                System.out.print("Carta um - representa ás -");
                break;
            case 2:
                System.out.print("Carta dois");
                break;
            case 3:
                System.out.print("Carta treis");
                break;
            case 4:
                System.out.print("Carta quatro");
                break;
            case 5:
                System.out.print("Carta cinco");
                break;
            case 6:
                System.out.print("Carta seis");
                break;
            case 7:
                System.out.print("Carta sete");;
                break;
            case 8:
                System.out.print("Carta oito");
                break;
            case 9:
                System.out.print("Carta nove");
                break;
            case 10:
                System.out.print("Carta dez");
                break;
            case 11:
                System.out.print("Carta onze - representa Valete - ");
                break;
            case 12:
                System.out.print("Carta doze - representa Rainha - ");
                break;
            default:
                System.out.print("Carta treza - representa Rei - ");
            break;
        }

        //verificação para o naipe.
        if (naipe == 1){
            System.out.println(" De Ouros");
        }else if(naipe == 2){
            System.out.println(" De Paus");
        }else if(naipe == 3){
            System.out.println(" De Copas");
        }else if(naipe == 4){
            System.out.println(" De Espadas");
        }
        
        ler.close();
    }
}