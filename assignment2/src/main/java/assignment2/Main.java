package assignment2;

public class Main {

	public static void main(String[] args) {
		
		//creo i candidati per una votazione ordinale
		Candidato giacomo = new Candidato("giacomo", 34, "A23BASJDUHFA2FHS", "password");
		Candidato luca = new Candidato("luca", 21, "D29BSSJDDHFA2FHS", "password");
		Candidato giovanni = new Candidato("giovanni", 35, "G2HBASJDUHFA2FHS","password");

		//creo lo scrutatore che può aprire la votazione
		Scrutatore damon = new Scrutatore("Damon", 21, "H19BSSJDDHFA2FHS");

		//apro la votazione
		Ordinale votazione = damon.creaVotazioneOrdinale("Elezioni comunali di Busto Arsizio");

		//aggiungo i candidati alla votazione
		votazione.addCandidato(giacomo);
		votazione.addCandidato(luca);
		votazione.addCandidato(giovanni);

	


		Elettore paolo = new Elettore("paolo", 20, "G29BSSJDDHFA2FHS", "123");
		Elettore fabio = new Elettore("fabio", 20, "S29BSSJDDHFA2FHS", "123");
		Elettore mirco = new Elettore("mirco", 20, "T29BSSJDDHFA2FHS", "123");
		Elettore maddalena = new Elettore("maddalena", 20, "C29BSSJDDHFA2FHS", "123");


		/**il sistema in cui ciascun elettore può votare è assolutamente da rivedere, l'idea è che per votare in maniera "ordinale" ciascun
		elettore mette in ordine i candidati in un array che in futuro dovra assolutamente essere un Set(senno posso votare piu volte la stessa persona)
		il candidato messo nella posizione 1 dell'array si aggiudica 1 punto, quello in seconda posizione 2 punti e cosi via..
		*/
		paolo.vota(votazione,  new Candidato[]{giacomo, luca, giovanni});
		fabio.vota(votazione,  new Candidato[]{luca, giacomo, giovanni});
		mirco.vota(votazione,  new Candidato[]{luca, giacomo, giovanni});
		maddalena.vota(votazione,  new Candidato[]{giovanni, luca, giacomo});
		giacomo.vota(votazione,  new Candidato[]{giovanni, luca, giacomo});
		luca.vota(votazione,  new Candidato[]{giovanni, luca, giacomo});

		System.out.println(votazione.risultato());

		
	
		


	
		
	}

}

