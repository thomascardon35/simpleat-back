package fr.cardon.simpleat.model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Reservation {

	
	private ReservationPK reservationpk;
	private int nbPersonne;
	
	public Reservation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Reservation(ReservationPK reservationpk, int nbPersonne) {
		super();
		this.reservationpk = reservationpk;
		this.nbPersonne = nbPersonne;
	}
	@EmbeddedId
	public ReservationPK getReservationpk() {
		return reservationpk;
	}
	public void setReservationpk(ReservationPK reservationpk) {
		this.reservationpk = reservationpk;
	}
	@Column(nullable = false)
	public int getNbPersonne() {
		return nbPersonne;
	}
	public void setNbPersonne(int nbPersonne) {
		this.nbPersonne = nbPersonne;
	}
	
	

}
