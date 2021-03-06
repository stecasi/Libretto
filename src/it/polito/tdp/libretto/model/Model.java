package it.polito.tdp.libretto.model;

import java.util.*;

public class Model {

	private List <Esame> esami;
	
	public Model(){
		this.esami = new LinkedList <Esame>();
	}
	
	/**
	 * Aggiunge un nuovo esame all'elenco degli esami presenti
	 * verificando che non ci sia gi�
	 * @param e
	 */
	public boolean addEsame(Esame e){
		if (!esami.contains(e)) {
		esami.add(e);
		return true;
		}
		else {
			return false;
			//oppure lascio il metodo void e lancio un'eccezione
			//throw new IllegalArgumentException("Esame non aggiunto poich� gi� presente");
		}
	}
	
	/**
	 * Ricerca se esiste un esame con il codice specificato.
	 * Se esiste, lo restituisce, altrimenti restituisce null.
	 * @param codice codice dell'esame da ricercare
	 * @return l'esame trovato, oppure null se non trovato
	 */
	public Esame cercaEsame (String codice){
		int pos = esami.indexOf(new Esame (codice, null, null));
		if (pos == -1){
			return null;
		}
		else {
		return esami.get(pos);
		}
	}
}
