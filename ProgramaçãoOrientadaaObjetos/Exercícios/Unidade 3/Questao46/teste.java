//mapeamento 'chave/valor' = informa a chave, resgata o valor.
import java.util.HashMap; //implementação da interface.
import java.util.TreeSet; //ordena em ordem crescente.

//HashMap facilita, cada elemento da lista possui uma chave e valor associado, realiza uma busca pela chave, sem precisar percorrer toda lista.

public class teste {
    public static void main(String[] args){
        String texto = "HELLO THERE";

        //Lista q implementa Map, do tipo caracteres 'valor' e inteiro 'chave'.
        HashMap<Character, Integer> mapa = new HashMap<>();

        //split retorna um vetor de string com as posicoes separadas.
        String[] palavras = texto.split(" ");//Regex recebe o caracter separor.
        
        for (String palavra: palavras){//foreach.

            //se tiver elemento entra.
            for (int i = 0; i < palavra.length(); i++){//.lenght retorna o comprimento da string.
                //convertendo todos os caracteres da string em letras minúsculas.
                palavra = palavra.toLowerCase();
                //retorna o caractere minusculo.
              Character caixaBaixa = palavra.charAt(i);

              //verificando se a chave esta sendo mapeada 'minuscula'.
              if(mapa.containsKey(caixaBaixa)){
                  int num = mapa.get(caixaBaixa);//buscando o valor mapeado pela chave 'caixabaixa'.
                  mapa.put(caixaBaixa, num + 1);//associa o valor especificado com a chave especificada, e incrementa a quantidade de vezes.
              }else {
                  mapa.put(caixaBaixa, 1);
              }
            }
        }

        //Lista q implementa Map, do tipo caracteres 'valor' e inteiro 'chave'.
        //TreeSet ordena em ordem crescente.
        TreeSet<Character> palavrasOrdenadas = new TreeSet<>(mapa.keySet());//keyset-conjunto de elementos-chave contidos no mapa.

        //foreach.
        for (Character palavra : palavrasOrdenadas) {
            //printando a letra e a quantidade repetida.
            System.out.printf("%c = %s\n", palavra, mapa.get(palavra));
        }
        //printando a lista map completa. 
        System.out.println(mapa);
    }
}