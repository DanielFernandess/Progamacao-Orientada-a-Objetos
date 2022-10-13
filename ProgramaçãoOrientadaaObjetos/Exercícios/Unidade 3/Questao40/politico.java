//herda de pessoa.
public class politico extends pessoa{
    private String SIGLA;
 
    politico(pessoa pessoa, String SIGLA){
      super(pessoa);
      this.SIGLA = SIGLA;
    }
 
    politico(String nome, int idade, String SIGLA){
     super(nome, idade);
     this.SIGLA = SIGLA;
    }
 
    public String getSIGLA(){
      return SIGLA;
    }
 
    public void setSIGLA(String SIGLA){
      this.SIGLA = SIGLA;
    }
 
    public String toString(){
      //super.toString = toString da classe mãe.
     String result = super.toString();
     result += " | SIGLA: "+ this.SIGLA;
 
     return result;
    }
 }