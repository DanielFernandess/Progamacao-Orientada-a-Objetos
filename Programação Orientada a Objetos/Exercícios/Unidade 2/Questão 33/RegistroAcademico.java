public class RegistroAcademico {
  private String nome;
  private int matricula;
  private int codigoCurso;
  private double percentualDeCobranca;
  public static int numeroDeMatriculas;
  //Static serve para referenciar todos os atributos/métodos de classe, ou seja, que podem ser acessados diretamente da definição da classe, sem precisar instanciar nenhum objeto.
  
  public void inicializaRegistro(String nome, int codigo, double percetual) {
    somaNumeroDeMatriculas(); //construtor. quando chamar funcao vai atualizar os valores
      this.nome = nome;
      this.matricula = numeroDeMatriculas;
      this.codigoCurso = codigo;
      this.percentualDeCobranca = percetual;
  }
  
  private static void somaNumeroDeMatriculas(){
    numeroDeMatriculas++;
  }
  
  public static int totalDeMatriculas(){
    return numeroDeMatriculas; 
  }
  
  public double calculaMensalidade() {
    return 100*codigoCurso*percentualDeCobranca;
  }
  
  public void setMatricula(int matricula) { //para usuario n v//
    this.matricula = matricula;
  }
  
  public int getMatricula() { //mostra matricula
    return matricula;
  }
  
  public void setNome(String nome) { 
      this.nome = nome;
  }
  
  public String getNome() {
      return this.nome;
    }
  
    public void setCodigo(int codigo) {
      this.codigoCurso = codigo;
    }
  
    public int getCodigo() {
      return this.codigoCurso;
    }
  
    public String toString() {
      return "Aluno: "+this.nome+"\nMatricula: "+this.matricula+"\nCodigo Do Curso: "+this.codigoCurso+"\n";
    }
  }