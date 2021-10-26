package assignment2;

public class Main {

	public static void main(String[] args) {
		
		Utente giacomo = new Utente("giacomo", 34, "F8FHW89F9F8W98FHWE");
		giacomo.vota();
		
		
		Elettore giovanni = new Elettore("giovanni", 43, "84382904i5h5hjklkjkj", "giova","pass");
		giovanni.risultati("asdfsaj", "dsjfklasd");
		
		
		Elezione nuovaElezione = new Elezione("codiceElezione",4);
		Scrutatore aldo = new Scrutatore("giovanni", 43, "84382904i5h5hjklkjkj", "giova","pass",nuovaElezione);
		aldo.creaElezione(0, 0);
		
		
	}

}

