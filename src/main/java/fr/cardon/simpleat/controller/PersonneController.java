package fr.cardon.simpleat.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import fr.cardon.simpleat.model.Personne;
import fr.cardon.simpleat.model.Role;
import fr.cardon.simpleat.repository.PersonneRepository;
import fr.cardon.simpleat.repository.RoleRepository;

@RestController
@CrossOrigin("*")
public class PersonneController {
	
	
	@Autowired
	private PersonneRepository personneRepository;
	
	@Autowired
	private RoleRepository roleRepository;
	
	@GetMapping("/")
	@ResponseBody
	public String home(){
		
		Personne p1 = new Personne();
        p1.setNom("Coco");
		p1.setPrenom("pouet");
		p1.setEmail("pouetcoco@gmail.com");
		p1.setPassword("hjfdzov");
		p1.setRoles(findRoleById(2));
		
		//ajoutPersonne(p1);
		

//		Personne p2 = new Personne("coco","pouet","cocopouet@gmail.com","motdepasse");
		
		StringBuilder sb = new StringBuilder();
		sb.append("<h1>Personne Enregistrée</h1>");
		sb.append("<a href='http://localhost:8080/users'>Voir la liste des personnes enregistrées</a>");
		return  sb.toString();
		
	}
	

	
	@GetMapping("/users")
	public Collection<Personne> findAll(){

		return personneRepository.findAll();
	}
	
	@GetMapping("/user/{id}")
	public Personne findPersonneById(@PathVariable int id){

		return personneRepository.findById(id);
	}
	
	@PostMapping("/add-user")
	public ResponseEntity<?> ajoutPersonne(@RequestBody Personne personne){
		return ResponseEntity.status(HttpStatus.OK).body(personneRepository.save(personne));
	}

	
	@PutMapping(value = "/update-user/{id}")
	public ResponseEntity<?> modifPerso(@PathVariable int id, @RequestBody Personne personne){

//		Personne persoAModif= null;
//		persoAModif = findById(id);
//		persoAModif.setNom(personne.getNom());
//		persoAModif.setPrenom(personne.getPrenom());
//		persoAModif.setEmail(personne.getEmail());
//		persoAModif.setPassword(personne.getPassword());
		return ResponseEntity.status(HttpStatus.OK).body(personneRepository.save(personne));
	}	
	
	@DeleteMapping(value = "/delete-user/{id}")
	public void suppressionPerso(@PathVariable int id){
//		Personne persoASuppr= new Personne();
//		persoASuppr = findById(id);
		
		personneRepository.deleteById(id);
	}

	
	public Collection<Role> findRoleById(int idRole){
		return roleRepository.findCollectionById(idRole);
	}
	
//	public Personne findById(int id) {
//		return personneRepository.getById(id);
//	}

}
