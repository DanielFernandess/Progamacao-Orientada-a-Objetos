import java.time.LocalDate;

//essa classe herda de livro.
public class livroLivraria extends livro{
  private int quantidade;
  private float preco;

  
  public livroLivraria(livro livro, int qtd, float preco){
    super(livro);
    //verifica a quantidade.
    this.quantidade = qtd > 0 ? qtd : 0;
    //verifica o preco.
    this.preco = preco > 0 ? preco : 0;
  }

  public livroLivraria(livro livro){
    super(livro);
    this.quantidade = 0;
    this.preco = 0;
  }

  public livroLivraria(String nomeLivro, String nomeAutor, LocalDate dataLancamento, String resumo, int quantidade, float preco){
    super(nomeLivro, nomeAutor, dataLancamento, resumo);
    this.quantidade = quantidade;
    this.preco = preco;
  }
  
  //getters.
  public String getNomeLivro(){
    return this.getNome();
  }
  public String getAutorLivro(){
    return this.getAutor();
  }
  public String getDataLancamentoLivro(){
    return this.getDataLancamento();
  }
  public float getPreco(){
    return this.preco;
  }
  public int getQuantidade(){
    return this.quantidade;
  }

  public void setPreco(float novoPreco){
    if(novoPreco>=0.0f) this.preco = novoPreco;
  }
  public void setQuantidade(int quantidade) {
    if(quantidade>0.0f) this.quantidade = quantidade;
  }

  public String toString() {
    String result = super.toString();
    result += " | Quantidade: " + this.quantidade + " | Preço: " + this.preco;

    return result;
  }
}