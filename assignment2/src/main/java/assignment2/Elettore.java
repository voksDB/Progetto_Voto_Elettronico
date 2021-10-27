package assignment2;

import java.util.Map;

//questo utente � un vero appassionato di elezioni, si registra e quindi pu� vedere i risultati
public class Elettore extends Utente {
	
	String password; 


	Elettore(String name, int age, String codFiscale,String password) {
		super(name, age, codFiscale);
		this.password = password;
	}
	
	
	public void vota(Ordinale o, Candidato[] c){

		

		if(c.length !=  o.getCandidati().keySet().size()) throw new IllegalArgumentException("Devi ordinare tutti i candidati della votazione");


		for(int i = 0; i<c.length; i++){
			o.getCandidati().put(c[i], o.getCandidati().get(c[i])+i+1);
		}


	}
	
	

}
