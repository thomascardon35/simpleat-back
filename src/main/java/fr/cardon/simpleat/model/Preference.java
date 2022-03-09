package fr.cardon.simpleat.model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Preference {

	private PreferencePK preferencePK;
	private int note;	
	private boolean favoris;
	
	
	
	public Preference() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public Preference(PreferencePK preferencePK) {
		super();
		this.preferencePK = preferencePK;
	}

	public Preference(PreferencePK preferencePK, int note, boolean favoris) {
		super();
		this.preferencePK = preferencePK;
		this.note = note;
		this.favoris = favoris;
	}


	@EmbeddedId
	public PreferencePK getPreferencePK() {
		return preferencePK;
	}
	public void setPreferencePK(PreferencePK preferencePK) {
		this.preferencePK = preferencePK;
	}
	@Column(nullable = true)
	public int getNote() {
		return note;
	}
	public void setNote(int note) {
		this.note = note;
	}
	@Column(nullable = true)
	public boolean isFavori() {
		return favoris;
	}
	public void setFavori(boolean favoris) {
		this.favoris = favoris;
	}
	
	

}