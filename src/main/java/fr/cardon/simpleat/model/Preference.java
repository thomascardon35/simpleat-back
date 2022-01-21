package fr.cardon.simpleat.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@IdClass(PreferencePK.class)
public class Preference {

	private Personne personne;
	private Restaurant restau;
	private int note;	
	private boolean favoris;
	
	
	
	public Preference() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Preference(Personne personne, Restaurant restau) {
		super();
		this.personne = personne;
		this.restau = restau;
	}

	

	public Preference(Personne personne, Restaurant restau, int note, boolean favoris) {
		super();
		this.personne = personne;
		this.restau = restau;
		this.note = note;
		this.favoris = favoris;
	}



	@Id
	@ManyToOne
	@JoinColumn(name="id_personne" )
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
	public Personne getPersonne() {
		return personne;
	}



	public void setPersonne(Personne personne) {
		this.personne = personne;
	}

	@Id
	@ManyToOne
	@JoinColumn(name="id_restau" )
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
	public Restaurant getRestau() {
		return restau;
	}



	public void setRestau(Restaurant restau) {
		this.restau = restau;
	}


	@Column(nullable = true)
	public int getNote() {
		return note;
	}



	public void setNote(int note) {
		this.note = note;
	}


	@Column(nullable = true)
	public boolean isFavoris() {
		return favoris;
	}



	public void setFavoris(boolean favoris) {
		this.favoris = favoris;
	}
	
	
	
	

}
