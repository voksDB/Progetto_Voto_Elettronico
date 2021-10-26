package assignment2;


//questo utente è un vero appassionato di elezioni, si registra e quindi può vedere i risultati
public class Elettore extends Utente {
	
	String password; 
	String username; 

	Elettore(String name, int age, String codFiscale,String username,String password) {
		super(name, age, codFiscale);
		this.username = username;
		this.password = password;
	}
	
	
	public void risultati(String utente,String password){
		System.out.println("si allora ha vinto salvini, contento?");
	}
	
	

}
