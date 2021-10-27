package assignment2;

import java.util.Objects;

//magari utente semplice che o va in presenza, o vota 1 volta senza registrarsi
public class Utente {
	

	private int age;
	private String name;
	private String codFiscale;

	
	
	Utente(String name,int age,String codFiscale){
		Objects.requireNonNull(name);
		Objects.requireNonNull(age);
		Objects.requireNonNull(codFiscale);
		if(codFiscale.length() != 16) throw new IllegalArgumentException("Codice fiscale non corretto");
		
		this.name = name;
		this.age = age;
		this.codFiscale = codFiscale;
	}
	
	public String getCodiceFiscale(){
		return this.codFiscale;
	}

	public String getNome(){
		return this.name;
	}
	
	@Override
	public String toString(){
		return "nome: " + name + " eta: " + age + " Codice Fiscale: "+ codFiscale;
	}

	@Override
	public boolean equals(Object obj){

        if(!(obj instanceof Utente)) return false;
        Utente u = (Utente) obj;
        return u.getCodiceFiscale().equals(codFiscale);

    }


	

}

