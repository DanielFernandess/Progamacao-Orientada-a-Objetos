import java.util.Scanner;

public class Matriz {
    private static final int LINHA = 2; //final define que o valor não pode ser alterado
    private static final int COLUNA = 2; //pede na questao 2x2
    private float matriz[][];//declarando arrey da matriz

    Matriz(){//contrutor 
        matriz = new float[2][2];
    }
    //funcao q le os dados digitados e preenche os espacos 
    public void preencherMatriz(){
        Scanner leitor = new Scanner(System.in);
        for (int i = 0; i < LINHA; i++) {
            for (int j = 0; j < COLUNA; j++) {
                System.out.println("digite o valor da LINHA "+i+" COLUNA "+j);
                float valor = leitor.nextFloat();//fznd a leitura 
                this.matriz[i][j] = valor;//camando a matirz e colocando os valores
            }
        }
        leitor.close();//fechando espaco de memoria armazenada 
    }
    //funcao para imprimir a matriz
    public void imprimirMatrizFormatada(){
        System.out.print("Matriz formatada");
        String matrizFormat = "";
        for (int i = 0; i < LINHA; i++){
            for (int j = 0; j < COLUNA; j++){
                if(j == 1){
                    matrizFormat += "|"+this.matriz[i][j]+"|\n";//chama os dados para linha e coluna
                }else{
                    matrizFormat += "|"+this.matriz[i][j]+"| ";
                }
            }
        }
       System.out.println("\n"+matrizFormat);//quebra de linha
    }
    //funcao para determinar matriz
    public float determinanteMatriz(){
        float diagonalPricipal = 1, diagonalSegudaria = 1;
        for (int i = 0; i < LINHA; i++) {
            for (int j = 0; j < COLUNA; j++) {
               if(i == j) {
                   diagonalPricipal *= this.matriz[i][j];//organizacao
               }else{
                   diagonalSegudaria *= this.matriz[i][j];
               }
            }
        }
       return diagonalPricipal - diagonalSegudaria; 
    }
}