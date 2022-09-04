import java.util.Stack;//import de pilha.

public class teste{
    public static void main(String[] args){
        String texto = "(()){}(())()";

        //so deixa as paranteses na ultilizaçao desse REGEX [^()] = ()
        texto = texto.replaceAll("[^()]", "");//replaceAll-substituindo todos os caracteres por "".

        //pilha de caractere.
        Stack<Character> pilha = new Stack<>();

        balancea(pilha, texto);
    }

    //metodo para balancear usando pilha de caractere.
    private static void balancea(Stack<Character> pilha, String texto){
         boolean verifique = true;
         int indice = 0;

         //enquanto tiver elemento na pilha, faz a verificação se esta balanceado ou n.
         while(indice < texto.length() && verifique){//lenght = retorna a quantidade de caracteres.
             
            char c = texto.charAt(indice);//charAt(i)=retorna o caractere do indice.
            //verificando se tem parentese.
            if(c == '('){
                pilha.push(c);//push = adiciona.
            }else {//verifica se a pilha esta vazia.
                if(pilha.isEmpty()) verifique = false;
                else pilha.pop();//remove o elemento do topo.
            }
            indice++;
         }
         
         if(verifique && pilha.isEmpty()){ 
            System.out.println("Está balaceada");
         }else{
            System.out.println("Não está balaceada");
         }
    }
}