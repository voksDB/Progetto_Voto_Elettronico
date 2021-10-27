


package assignment2;

import java.util.ArrayList;

//eh lui � il master delle elezioni, pu� crearle e gestirle insomma
public class Scrutatore extends Utente{
	
	//lista di sessioni che l'utente ha creato, ho fatto classe apposita
	
	
	
	Scrutatore(String name, int age, String codFiscale) {
		super(name, age, codFiscale);
		
	}

	public Ordinale creaVotazioneOrdinale(String nomeElezione) {
		return new Ordinale(nomeElezione);
	}

	public void stampaRisultato(Votazione v){
		
	}
	
}