import java.time.LocalDate;

public class personalizarData {
  //para converter formato de data.  
  public static LocalDate dataFormat(int ano, int mes, int dia){
    return LocalDate.of(ano, mes, dia);
  }
}