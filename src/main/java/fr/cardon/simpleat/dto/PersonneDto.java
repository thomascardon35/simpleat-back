package fr.cardon.simpleat.dto;

import java.util.List;


import com.sun.istack.NotNull;


/**
 * Specifique : AppUser DTO permet de renvoyer un User sans le mot de passe (REST response).
 */
public class PersonneDto {
	
	    private Long id;
	    private String email;
	    
	    public PersonneDto() { }


		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

}
