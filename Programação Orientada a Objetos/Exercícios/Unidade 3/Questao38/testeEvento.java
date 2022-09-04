public class testeEvento {
    public static void main(String[] args) {
      
      //criando 2 objetos utilizando os 2 construtores diferentes.
      //printando atual.
      eventoDelegacao eventoDelegacao1 = new eventoDelegacao();
      //printando como definido.
      eventoDelegacao eventoDelegacao2 = new eventoDelegacao("DELEGAÇÃO DEFINIDA  ", new dataHora(dataHora.horaPersonalizada(3, 12, 55), dataHora.dataPersonalizada(2022, 06, 01)));
      
      System.out.println(eventoDelegacao1);
      System.out.println(eventoDelegacao2);
      
      //printando atual.
      eventoHeranca eventoHeranca1 = new eventoHeranca();
      //printando como definido.
      eventoHeranca eventoHeranca2 = new eventoHeranca(new dataHora(dataHora.horaPersonalizada(3, 12, 55), dataHora.dataPersonalizada(2022, 06, 01)), "HERANÇA DEFINIDA");
  
      System.out.println(eventoHeranca1);
      System.out.println(eventoHeranca2);
    }
}