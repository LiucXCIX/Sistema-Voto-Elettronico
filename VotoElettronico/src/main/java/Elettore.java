/*
 * OVERVIEW: le istanze di questa classe rappresentano un elettore
 *           gli oggetti di questo tipo sono immutabili
 */
public class Elettore extends Utente {
	
	//costruttori
	/*
	 * ensures: inizializza un nuovo elettore
	 */
	public Elettore(int id, String name, String surname) {
		super(id, name, surname);
	}
	
	//metodi
	
	public void vote(SessioneVoto s, Votable c) {
		
	}
}
