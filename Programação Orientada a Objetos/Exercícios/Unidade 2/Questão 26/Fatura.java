public class Fatura{ //public : Todas as classes de qualquer pacote pode ter acesso a este método.

    float preco;
    int codigo,quantidaDeCompra=0;
    String descriçao;
    //funcao do id
    void ID(int cod){ 
    codigo = cod; 
    }
    //funcao da descricao
    void descriçao (String descriçaos){
        if(descriçao != null); 
        descriçao = descriçaos;
        descriçaos = "invalida";
        }
    //funcao para adicionar o preco
    void  adicionaPreco(float precos){
        if(preco < 0)
            preco = 0;
        else preco = precos;       
        }
    //funcao para adicionar a quantidade
    void  adicionaQuantidade(int quantidade){
        if(quantidaDeCompra<0)
            quantidaDeCompra=0;
        else quantidaDeCompra= quantidade;            
        }
    //funcao para calcular valor
    float calculaTotal(){
    return  quantidaDeCompra * preco ;
    }
    //funcao para mostrar
    void mostraFaturas(){

    System.out.println("ID = " + codigo);
    
    System.out.println("Descriçao = " + descriçao);

    System.out.println("Preço = " + preco);
     
    System.out.println("Quantidade = " + quantidaDeCompra);
    
    System.out.println("Fatura = " + calculaTotal());  //funcao com retorno
    }
}   