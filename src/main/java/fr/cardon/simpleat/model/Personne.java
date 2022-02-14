package fr.cardon.simpleat.model;


import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Personne {

    private int id;
    private String nom;
    private String prenom;
    private String email;
    private String password;
    private Collection<Role> roles = new ArrayList<Role>();
    private Collection<Preference> preference = new ArrayList<Preference>();
    
    
	public Personne() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Personne(String nom, String prenom, String email, String password) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.password = password;
	}




	public Personne(String nom, String prenom, String email, String password, Collection<Role> roles) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.password = password;
		this.roles = roles;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_personne")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Column(nullable = false)
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}

	@Column(nullable = false)
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Column(nullable = false)
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Column(nullable = false)
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	@ManyToMany
	@JoinTable(name="role_personne",
	joinColumns = @JoinColumn(name = "id_perso"/*nom créé dans table asso*/,referencedColumnName = "id_personne" /*classe en cours*/) )
	@JsonIgnoreProperties("roles")
	public Collection<Role> getRoles() {
		return roles;
	}


	public void setRoles(Collection<Role> roles) {
		this.roles = roles;
	}
	

	@OneToMany(mappedBy = "preferencePK.personne", cascade = CascadeType.REMOVE)
	@JsonIgnore
	public Collection<Preference> getPreference() {
		return preference;
	}


	public void setPreference(Collection<Preference> preference) {
		this.preference = preference;
	}

}