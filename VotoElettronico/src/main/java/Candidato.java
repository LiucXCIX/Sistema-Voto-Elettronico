
public class Candidato implements Votable {
	
	private String name;
	private String surname;
	private int id;

	public Candidato(int id, String name, String surname) {
		this.id = id;
		this.name = name;
		this.surname = surname;
	}
	
	public String getName() {
		return name + " " + surname;
	}

	public int getId() {
		return id;
	}

}
