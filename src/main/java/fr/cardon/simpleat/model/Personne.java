package fr.cardon.simpleat.model;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
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
    private List<EnumRole> roleList;
    
    
	public Personne() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

public Personne(String nom, String prenom, String email, String password, List<EnumRole> roleList) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.password = password;
		this.roleList = roleList;
	}




public Personne(String email, String password, List<EnumRole> roleList) {
		super();
		this.email = email;
		this.password = password;
		this.roleList = roleList;
	}




	public Personne(String nom, String prenom, String email, String password) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.password = password;
	}


	public Personne(String nom, String prenom, String email, String password,
			Collection<fr.cardon.simpleat.model.Role> roles, Collection<Preference> preference,
			List<EnumRole> roleList) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.password = password;
		this.roles = roles;
		this.preference = preference;
		this.roleList = roleList;
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

	@ElementCollection(fetch = FetchType.EAGER)
	@Enumerated(EnumType.STRING)
	public List<EnumRole> getRoleList() {
		return roleList;
	}


	public void setRoleList(List<EnumRole> roleList) {
		this.roleList = roleList;
	}







}
