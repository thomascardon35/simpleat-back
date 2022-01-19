package fr.cardon.simpleat.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Role {
	
	private int id;
	private String intitule;
	
	
	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Role(int id, String intitule) {
		super();
		this.id = id;
		this.intitule = intitule;
	}
	
	@Id
	@Column(name = "id_role")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Column(nullable = false)
	public String getIntitule() {
		return intitule;
	}
	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}

}
