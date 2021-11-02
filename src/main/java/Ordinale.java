
import java.util.Set;

/**
 * Overview: Le istanze di questa classe rappresentano una votazione ordinale.
 *           La votazione ordinale è un particolare tipo di votazione in cui l'elettore dovrà ordinare i candidati in base
 *           alle proprie preferenze
 */
public class Ordinale extends Votazione{

    
    /**
     * Crea una nuova votazione ordinale
     * @param nome nome della votazione ordinale
     */
    Ordinale(String nome) {
        super(nome);
        
    }

    @Override
    String risultato() {
        String r = "RISULTATO DELLA VOTAZIONE " + nome  + " :\n";
        Set<Candidato> c = candidati.keySet();
        for (Candidato candidato : c) {
            r += candidato.getNome() + " Ha ricevuto " + candidati.get(candidato) + " voti \n";
        }
        

        return r;
    }

}
