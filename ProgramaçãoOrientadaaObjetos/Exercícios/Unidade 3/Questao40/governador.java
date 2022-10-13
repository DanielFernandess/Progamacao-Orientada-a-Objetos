//herda de politico.
public class governador extends politico{
    private String cidade;
    private String estado;
  
    governador(String nome, int idade, String SIGLA, String cidade, String estado){
      super(nome, idade, SIGLA);//chama os métodos e variáveis ​​da classe do pai.
      this.cidade = cidade;
      this.estado = estado;
    }
  
    governador(pessoa pessoa, String SIGLA, String cidade, String estado){
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
    public void setEstado(String estado) {
      this.estado = estado;
    }

    public String toString() {
      //super.toString = toString da classe mãe.
      String result = super.toString();
      result += " | Cidade: " + this.cidade + " | Estado: " + this.estado + " | Cargo: Governador";
  
      return result;
    }
}