package assignment2;

import java.util.Objects;

/**
 * Overview: Le istanze di questa classe rappresentano un Utente
 * 			 L'utente è dotato di un nome, codice fiscale e di un età
 */
public class Utente {
	/**
	 * Funzione di astrazione: FA(age, name, codFiscale) = Utente di età= age, nome= name, codice fiscale= codFiscale
	 * Invariante di rappresentazione: nome,età, codice fiscale non nulli
	 */
	//CAMPI
	private int age;
	private String name;
	private String codFiscale;

	
	/**
	 * Crea una nuova istanza Utente
	 * @param name nome dell'utente
	 * @param age età dell'utente
	 * @param codFiscale codice fiscale
	 * @throws NullPointerException se uno dei parametri non viene specificato
	 */
	Utente(String name,int age,String codFiscale){
		Objects.requireNonNull(name);
		Objects.requireNonNull(age);
		Objects.requireNonNull(codFiscale);
		if(codFiscale.length() != 16) throw new IllegalArgumentException("Codice fiscale non corretto");
		
		this.name = name;
		this.age = age;
		this.codFiscale = codFiscale;
	}
	
	/**
	 * Restituisce il codice fiscale dell'utente this
	 * @return il codice fiscale
	 */
	public String getCodiceFiscale(){
		return this.codFiscale;
	}

	/**
	 * restituisce il nome dell'utente this
	 * @return nome dell'utente
	 */
	public String getNome(){
		return this.name;
	}
	
	/**
	 * @return l'et? dell'utente
	 */
	public int getAge() {
		return this.age;
	}
	
	
	@Override
	public String toString(){
		return "nome: " + name + " eta: " + age + " Codice Fiscale: "+ codFiscale;
	}

	@Override
	/**
	 * Due utenti sono uguali se hanno lo stesso codice fiscale
	 */
	public boolean equals(Object obj){

        if(!(obj instanceof Utente)) return false;
        Utente u = (Utente) obj;
        return u.getCodiceFiscale().equals(codFiscale);
    }
	
	@Override
	public int hashCode() {
		return  codFiscale.hashCode() ;
	}
	


}

