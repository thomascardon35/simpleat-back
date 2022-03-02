package fr.cardon.simpleat.model;


import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Embeddable
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


	@ManyToOne
	@PrimaryKeyJoinColumn(name="id_personne", referencedColumnName ="id_personne" )
	@JsonIgnore
	public Personne getPersonne() {
		return personne;
	}


	public void setPersonne(Personne personne) {
		this.personne = personne;
	}

	
	@ManyToOne // TODO mappedBy preferences dans restaurant
	@PrimaryKeyJoinColumn(name="id_restau",referencedColumnName ="id_restau" )
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
	public Restaurant getRestau() {
		return restau;
	}


	public void setRestau(Restaurant restau) {
		this.restau = restau;
	}

	

}
