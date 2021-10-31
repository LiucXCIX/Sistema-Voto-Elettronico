import java.util.List;
import java.util.Map;

/*
 * OVERVIEW: le istanze di questa classe rappresentano il gestore del sistema
 *           gli oggetti di questo tipo sono immutabili
 */
public class Gestore extends Utente {
	
	//costruttori
	/*
	 * ensures: inizializza un nuovo gestore
	 */
	public Gestore(int id, String name, String surname) {
		super(id, name, surname);
	}
	
	//metodi
	
	public void createNewSession(int id, List<Votable> v) {
		
	}
	
	public void addCandidates(SessioneVoto s, Votable v) {
		
	}
	
	public void addCandidates(Votable v) {
		
	}
	
	public void beginVotingSession(SessioneVoto s) {
		
	}
	
	public void endVotingSession(SessioneVoto s) {
		
	}
	
	public Map<Votable, Integer> viewSessionResult(SessioneVoto s) {
		
	}

}
