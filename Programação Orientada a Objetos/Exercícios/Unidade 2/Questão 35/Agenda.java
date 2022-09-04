public class Agenda {
    private EntradaEmAgenda[] agendaDeCompromissos;
    private static int MAX_DIA = 31; 
    //max dia = declarado como arrey de limite = 31

    Agenda() { //construtor
        agendaDeCompromissos = new EntradaEmAgenda[MAX_DIA]; //arrey, chamando entradaemagenda na outra classe
    }

    public void listaDia(int dia, int mes, int ano) {
        int verificarDia = -1;

        System.out.println("Encontro nesse dia, mes e ano!");
        
        for (EntradaEmAgenda agenda :agendaDeCompromissos) { //verificacao
            if (agenda != null && agenda.ehNoDia(dia, mes, ano)) { //ehnodia pede na questao
                System.out.println(agenda);
                verificarDia = 1;
            }
        }

        if(verificarDia == -1){
            System.out.println("Sem encontro nessa data");
        }
    }

    public void imprimirAgenda() {
        for (EntradaEmAgenda agenda : agendaDeCompromissos) { //pegando instancia da classe entradaemagenda
            if (agenda != null) {
                System.out.println(agenda);
            }
        }
    }

    public void adicionaDiaNaAgenda(int dia, int mes, int ano, int hora, String assunto) {
        for (int i = 0; i < agendaDeCompromissos.length; i++) { //length = chamado do arrey
            if (agendaDeCompromissos[i] == null) {
                agendaDeCompromissos[i] = new EntradaEmAgenda(hora, dia, mes, ano, assunto);
                break;
            }
        }
    }
}