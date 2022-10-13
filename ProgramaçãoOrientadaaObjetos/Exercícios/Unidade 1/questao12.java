import java.util.Scanner;

public class questao12{

    public static void main(String[] args){
        Scanner ler = new Scanner (System.in);

        int n, soma = 0, i;
        
        System.out.println("Programa que escreve os 4 primeiros numeros perfeitos!\n");
        do { //usei "do while" para facilitar a execução.
            System.out.print("Digite um numero maior que zero: ");
            n = ler.nextInt(); //recebendo n, pois não conseguir fazer sem entrada(q era o exigido na questao).
            
            //4 primeiros numeros perfeitos = 6 / 28 / 496 / 8128.

            System.out.print(+n+ " = "); //printanddo o numero digitado
            //intervalo de repetição: i começa em 1 pois é o primeiro, e vai ate menor que n, pois o proprio numero não entra na soma dos divisores, e a cada passo incrementa o i.
            for(i = 1; i < n; i++){
                if(n % i == 0){ //para saber se o n é divisivel por i. se o resto de n dividido por i for igual a 0, entao i é divisor de n.
                    soma += i;//soma o valor de n mais o i.
                    System.out.print(+i+ "+"); //printar o numero da vez.
                }
            }
            //verificações se é numero perfeito ou não.
            if (soma == n){//se for igual é numero perfeito.
                System.out.println(" Eh um numero perfeito\n");
            }
            else{
                System.out.println(" Nao eh um numero perfeito\n");
            }
            soma = 0;//sempre zerando soma no final da execução para no proximo não vir com o ultimo numero digitado e somar com o novo numero.

        } while (n != 0); //Se digitar 0 sai do codigo.
        ler.close();
    }
}