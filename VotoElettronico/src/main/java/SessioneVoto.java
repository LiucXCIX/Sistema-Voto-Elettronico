import java.util.List;
import java.util.Map;

public class SessioneVoto {
	
	private final int id;
	private List<Votable> candidates;
	private Map<Votable, Integer> votes;
	private boolean isOpen;
	private ModalitaVoto mode;
	
	public SessioneVoto (int id, ModalitaVoto mode) {
		this.id = id;
		this.mode = mode;
		isOpen = false;
	}
	
	void addCandidates (Votable v) {
		
	}
	
	void addCandidates (List<Votable> v) {
		
	}
	
	void beginVotingSession () {
		isOpen = true;
	}
	
	void endVotingSession () {
		isOpen = false;
	}
	
	void addVote (Votable v) {
		
	}
}
