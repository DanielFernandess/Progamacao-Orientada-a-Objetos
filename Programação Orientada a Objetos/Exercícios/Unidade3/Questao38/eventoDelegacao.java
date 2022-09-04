public class eventoDelegacao {
    private String evento;
    private dataHora dataHora;
  
    eventoDelegacao(String evento, dataHora dataHora){
      //inicializando.
      this.evento = evento;
      this.dataHora = dataHora;
    }
  
    eventoDelegacao(){
      this.evento = "DELEGAÇÃO";
      this.dataHora = new dataHora();//delegaçao, delegando o trabalho de inicializar para a outra classe
    }
  
    public dataHora getDataHora() {
      return dataHora;
    }
    public void setDataHora(dataHora dataHora) {
      this.dataHora = dataHora;
    }
    public String getEvento() {
      return evento;
    }
    public void setEvento(String evento) {
      this.evento = evento;
    }
  
    public String toString() {
      return "EVENTO " + this.evento + ": { " + this.dataHora + " }";
    }
}