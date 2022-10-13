//imports para data e hora.
import java.time.LocalDate;
import java.time.LocalTime; 

public class dataHora{
  private LocalTime horario;
  private LocalDate data;
  
  dataHora(LocalTime horario, LocalDate data){
    this.data = data;
    this.horario = horario;
  }

  dataHora(){
    this.data = LocalDate.now(); //data atual da maquina
    this.horario = LocalTime.now(); //hora atual da maquina
  }

  //metodos personalizando data e hora
  public static LocalDate dataPersonalizada(int ano, int mes, int dia){
    return LocalDate.of(ano, mes, dia);
  }
  public static LocalTime horaPersonalizada(int hora, int min, int sec){
    return LocalTime.of(hora, min, sec);
  }

  //get - obter informações.
  public LocalDate getData() {
    return data;
  }
  public LocalTime getHorario() {
    return horario;
  }

  //set - definir valores.
  public void setData(LocalDate data) {
    this.data = data;
  }
  public void setHorario(LocalTime horario) {
    this.horario = horario;
  }

  //Retornando representação string do objeto.
  public String toString() {
    return "A Data é "+this.data+" com hora " + this.horario;
  }
}