
/**
 * overview: Le istanze di questa clase rappresentano un Candidato.
 * 			 Il candidato è un particolare tipo di Utente che può appartenere
 *           ad un partito politico
 */
public class Candidato extends Elettore{
    
    //CAMPI
    //private Partito partito;

    /**
     * Costruisce un nuovo candidato
     * @param nome
     * @param eta
     * @param codFiscale
     * @param password
     */
    Candidato(String nome, int eta, String codFiscale, String password){
        super(nome,eta,codFiscale,password);
    }

    
}
