public class pessoa{
    private String nome;
    private int idade;
  
    pessoa(String nome, int idade){
      this.nome = nome;
      this.idade = idade;
    }
  
    pessoa(pessoa pessoa) {
     this.nome = pessoa.nome;
     this.idade = pessoa.idade;
    }

    //gets
    public int getIdade() {
      return this.idade;
    }
    public String getNome() {
      return this.nome;
    }
    //sets
    public void setIdade(int idade) {
      this.idade = idade;
    }
    public void setNome(String nome) {
      this.nome = nome;
    }
    
    public String toString(){
      String result = " | Nome: " + this.nome + " | Idade: " + this.idade;
  
      return result;
    }
  }