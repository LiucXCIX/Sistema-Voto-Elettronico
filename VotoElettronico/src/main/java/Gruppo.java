import java.util.List;

public class Gruppo implements Votable {
	
	private int id;
	private String name;
	private List<Candidato> candidates;
	
	public Gruppo(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

}
