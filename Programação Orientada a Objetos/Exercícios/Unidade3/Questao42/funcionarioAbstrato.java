public abstract class funcionarioAbstrato{
    protected String nome;
    protected String departamento;
    protected int idade;
    protected double salario;
    protected double valorhoraTrabalhanda;

    funcionarioAbstrato(String nome){
        this.nome = nome;
        this.valorhoraTrabalhanda = 2.0;
    }

    funcionarioAbstrato(String nome, double horaTrabalhanda){
        this.valorhoraTrabalhanda = horaTrabalhanda;
        this.nome = nome;
    }

    //getts.
    public double getValorHoraTrabalhanda() {
        return this.valorhoraTrabalhanda;
    }
    public double getSalario() {
        return this.salario;
    }
    public int getIdade() {
        return this.idade;
    }
    public String getNome() {
        return this.nome;
    }
    public String getDepartamento() {
        return this.departamento;
    }

    //sets.
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public void setValorHoraTrabalhanda(double horaTrabalhanda) {
        this.valorhoraTrabalhanda = horaTrabalhanda;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
}