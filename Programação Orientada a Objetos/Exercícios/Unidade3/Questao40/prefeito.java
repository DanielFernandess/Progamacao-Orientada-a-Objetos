//herda de politico.
public class prefeito extends politico{
    private String cidade;
    private String estado;
  
    public prefeito(String nome, int idade, String cor, String SIGLA, String cidade, String estado){
      super(nome, idade, SIGLA);
      this.cidade = cidade;
      this.estado = estado;
    }
  
    public prefeito(pessoa pessoa, String SIGLA, String cidade, String estado){
      super(pessoa, SIGLA);
      this.cidade = cidade;
      this.estado = estado;
    }
  
    public String getCidade(){
      return cidade;
    }
    public String getEstado(){
      return estado;
    }
  
    public void setCidade(String cidade){
      this.cidade = cidade;
    }
    public void setEstado(String estado){
      this.estado = estado;
    }
  
    public String toString(){
      //super.toString = toString da classe mãe.
      String result = super.toString();
      result += " | Cidade: " + this.cidade + " | Estado: " + this.estado + " | Cargo: Prefeito";
  
      return result;
    }
  }