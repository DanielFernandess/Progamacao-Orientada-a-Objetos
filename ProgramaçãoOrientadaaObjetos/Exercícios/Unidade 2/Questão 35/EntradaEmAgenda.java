public class EntradaEmAgenda {
    private  String assunto;
    private int dia, mes, ano, hora;

    EntradaEmAgenda(int hora, int dia, int mes, int ano, String assunto){ //construtor ja criado na class agenda
        this.setHora(hora >= 1 && hora <= 24 ? hora : 0); //como esta private, chama this.set
        this.setDia(dia >= 1 && dia <= 31 ? dia : 0);
        this.setMes(mes >= 1 && mes <= 12 ? mes : 0);
        this.setAno(ano);
        this.setAssunto(assunto == null ? "Vazio" : assunto);
    }

    public boolean ehNoDia(int dia, int mes, int ano) {//utiliza na class agenda
        return this.getDia() == dia && this.getMes() == mes && this.getAno() == ano; //ja q usou set, agr mostra apenas o q quer para o usuario com get
    }

    public void setDia(int dia){
        this.dia = dia; 
    }

    public void setMes(int mes){
        this.mes = mes;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    public void setHora(int hora){
        this.hora = hora;
    }

    public void setAssunto(String assunto){
        this.assunto = assunto;
    }

    public String getAssunto(){
        return this.assunto;
    }

    public int getDia(){
        return this.dia;
    }

    public int getMes(){
        return this.mes;
    }

    public int getAno(){
        return this.ano;
    }

    public int getHora(){
        return this.hora;
    }

    public String toString(){//pede na questao - toesting = retorno de texto
        String mensagem = " ";
        System.out.println("Data: "+this.getDia()+"/"+this.getMes()+"/"+this.getAno()); //mostra o dia,mes e ano por causa do get
        System.out.println("As: " + this.getHora());
        System.out.println("Assunto: "+ this.getAssunto());
        return mensagem;
    }
}