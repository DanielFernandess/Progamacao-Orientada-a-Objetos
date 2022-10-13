public class AlunoDemo {
  //Static serve para referenciar todos os atributos/métodos de classe, ou seja, que podem ser acessados diretamente da definição da classe, sem precisar instanciar nenhum objeto.
  public static void main(String[] args) {
    Aluno aluno = new Aluno();
  
    aluno.nomeAluno("Daniel");
    aluno.matricula("201902");
    aluno.adicionaNota1(8);
    aluno.adicionaNota2(1);
    aluno.adicionaNotaDeTrabalho(1);
  
    aluno.mostraResultado();
  }
}