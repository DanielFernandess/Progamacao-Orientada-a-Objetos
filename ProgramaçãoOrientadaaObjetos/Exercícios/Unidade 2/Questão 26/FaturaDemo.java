public class FaturaDemo {
    public static void main(String[] args) {
        Fatura fd = new Fatura(); 

        fd.ID(385);
        fd.descriçao("Processador");
        fd.adicionaPreco(620.0f);
        fd.adicionaQuantidade(2);

        fd.mostraFaturas(); 
    }
}