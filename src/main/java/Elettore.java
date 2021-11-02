
import java.util.Objects;
import java.util.Set;

/**
 * overview: Le istanze di questa clase rappreentano un Elettore.
 * 			 L'elettore è un particolare tipo di Utente dotato di una password
 * 			 e di un metodo per votare
 */
public class Elettore extends Utente {
	/**
	 * Funzione di astrazione: FA(nome,cognome,codice fiscale, pasword) = Elettore con nome=nome, cognome=cognome, password=password, CF= CF
	 * Invariante di rappresentazione: Password non nulla
	 */
	

	

	 //CAMPI

	String password; 


	/**
	 * Costruisce un nuovo Elettore
	 * @param name nome dell'elettore
	 * @param age  età dell'elettore
	 * @param codFiscale codice fiscale dell'elettore
	 * @param password password dell'elettore
	 * @throws NullPointerException se la password è null
	 */
	Elettore(String name, int age, String codFiscale,String password) {
		super(name, age, codFiscale);
		Objects.requireNonNull(password);
		this.password = password;
	}
	
	/**
	 * Permette all'elettore di esprimere la sua preferenza di voto rispetto a dei
	 * candidati in un elezione
	 * @param o elezione
	 * @param candidati candidati all'elezione
	 */
	public void vota(Ordinale o, Set<Candidato> candidati){

	}
	
	

}
