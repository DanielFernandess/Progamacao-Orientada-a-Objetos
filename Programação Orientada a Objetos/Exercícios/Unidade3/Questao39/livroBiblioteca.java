import java.time.LocalDate;

//essa classe herda de livro.
public class livroBiblioteca extends livro{
  private boolean emprestado;
  private String leitor;

  livroBiblioteca(String nomeLivro, String nomeAutor, LocalDate dataLancamento, String resumo, String leitor){
    //super - Chama os métodos e variáveis ​​da classe do pai.
    super(nomeLivro, nomeAutor, dataLancamento, resumo);
    this.leitor = leitor;
    this.emprestado = true;
  }
  livroBiblioteca(livro livro){
    super(livro);
  }
  
  //obtendo e definindo valores.
  public String getLeitor(){
    return this.leitor;
  }
  public void setLeitor(String leitor){
    this.leitor = leitor;
  }

  //obtendo e definindo valores.
  public boolean getEmprestado(){
    return this.emprestado;
  }
  public void setEmprestado(boolean emprestado){
    if(!this.emprestado){
      this.emprestado = true;
    }
  }
  
  public String toString() {
    String result = super.toString();

    //se n tiver leitor, livro disponivel.
    if (this.leitor == null){
      System.out.println("Livro esta livre para emprestimo");
    }
    else{//se n, mostrar leitor.
      System.out.println(this.leitor);
    }
    return result;
  }
}