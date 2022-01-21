package fr.cardon.simpleat.model;


import java.io.Serializable;

import javax.persistence.Embeddable;



public class PreferencePK implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Personne personne;
	private Restaurant restau;
	
	
	public PreferencePK() {
		super();
		// TODO Auto-generated constructor stub
	}


	public PreferencePK(Personne personne, Restaurant restau) {
		super();
		this.personne = personne;
		this.restau = restau;
	}


	public Personne getPersonne() {
		return personne;
	}


	public void setPersonne(Personne personne) {
		this.personne = personne;
	}

	public Restaurant getRestau() {
		return restau;
	}


	public void setRestau(Restaurant restau) {
		this.restau = restau;
	}

	

}
