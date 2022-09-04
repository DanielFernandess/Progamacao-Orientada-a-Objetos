public class Aluno {
  String matricula, nome;
  double nota1, nota2, nTrabalho;
//funcao aluno
void nomeAluno(String nomes){
  nome = nomes;
}
//funcao matricula
void matricula(String matriculas){
  matricula = matriculas;
}
//funcao para nota 1
void adicionaNota1(double n1){
  nota1 = n1;
}
//funcao para nota 2
void adicionaNota2(double n2){
  nota2 = n2;
}
//funcao para nota de trabalho
void adicionaNotaDeTrabalho(double notaTrabalho){
  nTrabalho = notaTrabalho;
}
//funcao para conta da media
double media(){
  return ((nota1 + nota2)*2.5+nTrabalho*2)/7;
}
//funcao para prova final
double provaFinal(){
  double media = media(); //chamando e recebendo funcao acima
    if (media < 2.5 || media >= 5){
      return 0;
    }else {
      return (10 - media);
    }
  }
//funcao para mostrar o resultado
void mostraResultado(){ 
  System.out.print("O aluno " + nome + ", com matricula = " +matricula+ "");

    if (provaFinal()==0){
      System.out.print("aprovado");
    }else{
      System.out.println("" +media()+ " esta na quarta prova precisando de " +(provaFinal()));
    }
  }
}