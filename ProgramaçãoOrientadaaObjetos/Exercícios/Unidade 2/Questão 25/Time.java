public class Time {
    String campeonato, time;
    String tecnico;
    int vitoria, derrota,empate;

    //funcao campeonato e time
    void status(){
        System.out.println("Campeonato = " + campeonato); 
        System.out.println("Time = " + time );
    }
    //funcao para tecnico
    void tecnico(){
        System.out.println("Tecnico = " +tecnico );
    }
    //funcao para vitoria
    void vitoria( ){
        System.out.println("Vitoria = " +vitoria);
    }
    //funcao para derrota
    void derrota( ){
            System.out.println("Derrota = " + derrota );
    }
    //funcao para empate
    void empate( ){
        System.out.println("Empate = " + empate );            
    }
}