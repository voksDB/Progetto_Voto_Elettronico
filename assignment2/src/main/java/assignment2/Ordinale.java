package assignment2;

import java.util.Set;

public class Ordinale extends Votazione{

    

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
