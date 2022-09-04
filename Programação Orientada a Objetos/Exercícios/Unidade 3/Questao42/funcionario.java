//herda de funcionarioAbstrato.
public class funcionario extends funcionarioAbstrato{
    funcionario(String nome) {
        super(nome);//chama os métodos e variáveis ​​da classe do pai.
    }

    funcionario(String nome, double horaTrabalhada){
        super(nome, horaTrabalhada);
    }

    //metodo para calcular salario mensal. = Dias trabalhados * hrs.
    public void setCalculoSalarioMes(int diasTrabalhados, float horarioFixo){
        this.setSalario(diasTrabalhados * this.getValorHoraTrabalhanda() * horarioFixo);
    }
    //metodo para calular salario semanal. = Dias trabahados * hrs.
    public double SalarioSemana(int diasTrabalhados, float horarioFixo){
        return diasTrabalhados * this.getValorHoraTrabalhanda() * horarioFixo;
    }

    public String toString() {
        return "Funcionario{" +
                "nome='" + this.nome + '\'' +
                ", idade=" + this.idade +
                ", departamento='" + this.departamento + '\'' +
                ", salario mensal=" + this.salario +
                ", hora Trabalhada=" + this.valorhoraTrabalhanda +
                '}';
    }
}