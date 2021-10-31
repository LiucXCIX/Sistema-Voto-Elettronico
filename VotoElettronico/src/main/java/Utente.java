/*
 * OVERVIEW: le istanze di questa classe rappresentano un utente
 *           gli oggetti di questo tipo sono immutabili
 */
public class Utente {
	//campi:
	private final int id;
	private final String name;
	private final String surname;
	
	//costruttori:
	/*
	 * ensures: inizializza un nuovo utente
	 */
	public Utente(int id, String name, String surname) {
		this.id=id;
		this.name=name;
		this.surname=surname;
	}
	
	//metodi:
	/*
	 * ensures: restituisce this.id
	 */
	public int get_id() {
		return id;
	}
	
	/*
	 * ensures: restituisce this.name
	 */
	public String get_name() {
		return name;
	}
	
	/*
	 * ensures: restituisce this.surname
	 */
	public String get_surname() {
		return surname;
	}
}
