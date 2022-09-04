public class RegistroAcademicoDemo {

  public static void main(String[] args) {
    RegistroAcademico aluno1 = new RegistroAcademico();
    aluno1.inicializaRegistro("Daniel", 1, 0.5); //nome/matricula/percentual
    System.out.println(aluno1);
    
    RegistroAcademico aluno2 = new RegistroAcademico();
    aluno2.inicializaRegistro("Gustavo",2, 0.5);
    System.out.println(aluno2);
  
    RegistroAcademico aluno3 = new RegistroAcademico();
    aluno3.inicializaRegistro("Paulo",2, 0.7);
    System.out.println(aluno3);
    
    RegistroAcademico aluno4 = new RegistroAcademico();
    aluno4.inicializaRegistro("Alef",2, 0.7);
    System.out.println(aluno4);
    
    System.out.println("Numero de alunos matriculados = "+ RegistroAcademico.totalDeMatriculas()); //chamando construtor//
  }
}