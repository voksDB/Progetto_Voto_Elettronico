
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * OVERVIEW: Le istanze che estendono questa classe devono rappresentare una votazione.
 *           Ciascuna votazione deve avere un nome ed un insieme di candidati.
 *           Ciascuna votazione deve implementare un metodo per mostrare il risultato della votazione
 *           Ciascuna votazione è dotata di un metodo per aggiungere candidati e per visualizzarli
 * 
 */
public abstract class Votazione {
    //CAMPI
    String nome;
    Map<Candidato,Integer> candidati;


    /**
     * Crea una nuova votazione
     * @param nome nome della votazione
     * @throws NullPointerException se il nome è vuoto
     */
    Votazione(String nome){
        Objects.requireNonNull(nome);
        this.nome = nome;
        candidati = new HashMap<Candidato,Integer>();
    }

    /**
     * Aggiunge un candidato all'insieme dei candidati
     * @param c candidato da aggiungere
     */
    public void addCandidato(Candidato c){

        candidati.put(c, 0);

    }
    

    /**
     * Restituisce l'insieme dei candidati della votazione
     * @return I candidati della votazione
     */
    public Map<Candidato,Integer> getCandidati(){
        return this.candidati;
    }

    /**
     * Restituisce il vincitore della votazione
     * @return rappresentazione in Stringa del vincitore della votazione
     */
    abstract String risultato();
}
