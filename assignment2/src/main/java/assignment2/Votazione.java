package assignment2;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public abstract class Votazione {
    String nome;
    Map<Candidato,Integer> candidati;

    Votazione(String nome){
        this.nome = nome;
        candidati = new HashMap<Candidato,Integer>();
    }

    public void addCandidato(Candidato c){

        candidati.put(c, 0);

    }
    


    public Map<Candidato,Integer> getCandidati(){
        return this.candidati;
    }

    abstract String risultato();
}
