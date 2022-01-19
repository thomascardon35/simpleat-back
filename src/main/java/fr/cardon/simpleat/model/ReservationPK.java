package fr.cardon.simpleat.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Embeddable
public class ReservationPK implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Personne personne;
	private Restaurant restau;
	private Date date;
	
	
	public ReservationPK() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ReservationPK(Personne personne, Restaurant restau, Date date) {
		super();
		this.personne = personne;
		this.restau = restau;
		this.date = date;
	}
	
	@ManyToOne
	@JoinColumn(name="id_personne", referencedColumnName ="id_personne" )
	public Personne getPersonne() {
		return personne;
	}
	public void setPersonne(Personne personne) {
		this.personne = personne;
	}
	@ManyToOne
	@JoinColumn(name="id_restau",referencedColumnName ="id_restau" )
	public Restaurant getRestau() {
		return restau;
	}
	public void setRestau(Restaurant restau) {
		this.restau = restau;
	}
	@Column(name="date_resa")
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	

}
