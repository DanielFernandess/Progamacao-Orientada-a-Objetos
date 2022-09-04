import java.util.LinkedList;
//LinkedList é uma implementação da interface List.

public class teste {
    public static void main(String[] args){
        //uma lista de caracteres. 
        LinkedList<Character> letras = new LinkedList<Character>();
        
        //preenchendo a lista.
        //adicionando elemento na lista com ".add".
        letras.add('D');
        letras.add('I');
        letras.add('S');
        letras.add('C');
        letras.add('I');
        letras.add('P');
        letras.add('L');
        letras.add('I');
        letras.add('N');
        letras.add('A');

        //Ordem de inserção.
        System.out.println("Lista Na Ordem De Insercao " + letras);

        //outra lista de carateres - para ser usada como inversa.
        LinkedList<Character> letrasInversa = new LinkedList<>();

        
        //buscando valores na primeira lista e colocando na segunda(inversa).
        for (int i = letras.size() - 1; i >= 0; i--) {//size()=obter o tamanho da lista.
            
            //adicionando o elemento na lista inversa.
            letrasInversa.add(letras.get(i));//get=buscando elemento no índice da lista.
        }

        //Ordem inversa dos elementos.
        System.out.println("Lista Inversa " + letrasInversa);
    }
}