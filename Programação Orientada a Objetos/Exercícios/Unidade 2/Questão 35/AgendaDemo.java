public class AgendaDemo {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();// instancia com nome agencia

        agenda.adicionaDiaNaAgenda(5, 5, 2022, 9, "Aula de POO");//chamando consturtor
        agenda.adicionaDiaNaAgenda(6, 2, 2022, 11, "Lista de Redes");
        agenda.adicionaDiaNaAgenda(9, 2, 2022, 13, "Avaliacao de Algebra");

        //funcao para imprimir a agenda
        agenda.imprimirAgenda();

        // agenda.listaDia(19, 1, 2021); // teste de dia nao existente
        //pesquisa em um dia especifico
        agenda.listaDia(5, 5, 2022); // aula de POO
    }
}