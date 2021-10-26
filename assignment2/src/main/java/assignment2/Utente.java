package assignment2;


//magari utente semplice che o va in presenza, o vota 1 volta senza registrarsi
public class Utente {
	

	int age;
	String name;
	String codFiscale;

	
	
	Utente(String name,int age,String codFiscale){
		this.name = name;
		this.age = age;
		this.codFiscale = codFiscale;
	}
	
	
	public void vota() {
		System.out.println(name + "sta votando..");
	}


	public void provoPush(){}

}

