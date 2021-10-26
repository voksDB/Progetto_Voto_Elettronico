


package assignment2;

import java.util.ArrayList;

//eh lui è il master delle elezioni, può crearle e gestirle insomma
public class Scrutatore extends Elettore{
	
	//lista di sessioni che l'utente ha creato, ho fatto classe apposita
	ArrayList<Elezione> elezioni = new ArrayList<Elezione>();
	
	
	Scrutatore(String name, int age, String codFiscale, String username, String password,Elezione elezione) {
		super(name, age, codFiscale, username, password);
		elezioni.add(elezione);
	}

	public void creaElezione(int durata,int nomeElezione) {
		System.out.println("si si si,fidati ho creato un'elezione");
	}
	
}