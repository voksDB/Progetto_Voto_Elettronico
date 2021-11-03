package assignment2;

import java.util.ArrayList;

/**
 * Overview: Le istanze di questa classe rappresentano uno scrutatore.
 * 			 Lo scrutatore è un particolare tipo di utente in grado di creare votazioni e di determinarne il risultato.
 */
public class Scrutatore extends Utente{
	
	
	/**
	 * Crea una nuova istanza Scrutatore
	 * @param name nome dello scrutatore
	 * @param age età dello scrutatore
	 * @param codFiscale codice fiscale dello scrutatore
	 */
	Scrutatore(String name, int age, String codFiscale) {
		super(name, age, codFiscale);
		
	}

	/**
	 * Crea una nuova votazione ordinale
	 * @param nomeElezione nome della votazione ordinale
	 * @return nuova votazione ordinale
	 */
	public Ordinale creaVotazioneOrdinale(String nomeElezione) {
		return new Ordinale(nomeElezione);
	}

	/**
	 * Restituisce il risultato della votazione
	 * @param v Votazione di cui si vuole conoscere il risultato
	 */
	public void stampaRisultato(Votazione v){
		
	}
	
}