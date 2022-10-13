import java.util.Scanner;

public class questao14{

    public static void main(String[] args){
        Scanner ler = new Scanner (System.in);
        
        //variaveis.
        double CidadeA = 7000, CidadeB = 20000; 
        int contador = 0;
        
        System.out.println("Programa para calcular crescimento populacional!\n");

        //enquanto a populaçao da cidade A for menor que cidade B.
        while (CidadeA < CidadeB){ //cada vez q passar ira fzr o crescimento anual.
            CidadeA = CidadeA * 1.035; //multiplicando a populaçao por 3,5%.
            CidadeB = CidadeB * 1.01; //multiplicando a população B por 1%
            contador += 1; //incrementando o contador.
            
            System.out.printf("Contagem do ano = " + contador + "\t A = " + CidadeA +"\t B = "+ CidadeB);
            System.out.println("");
        }
        System.out.println("");
        System.out.println("Sao preciso " + contador + " anos para a populacao do pais A ultrapasse ou iguale ao pais B!");
        
        ler.close();
    }
}