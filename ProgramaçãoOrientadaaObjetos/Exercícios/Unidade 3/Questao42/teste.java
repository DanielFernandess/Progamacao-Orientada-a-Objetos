public class teste {
  public static void main(String[] args) {

    funcionario funcionario = new funcionario("Alef");
    funcionario.setDepartamento("Tecnologia da Infomação");
    funcionario.setIdade(22);

    //personalizando dias e hrs trabalhados por mes = salario mensal.
    funcionario.setCalculoSalarioMes(20, 8);
    //perzonalizando dias e hrs trabalhadas = salario semanal.
    System.out.println("Salario semanal = " + funcionario.SalarioSemana(5,8));
    System.out.println(funcionario);
  }
}