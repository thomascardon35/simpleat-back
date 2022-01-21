package fr.cardon.simpleat.controller;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.cardon.simpleat.model.Preference;
import fr.cardon.simpleat.model.PreferencePK;
import fr.cardon.simpleat.repository.PersonneRepository;
import fr.cardon.simpleat.repository.PreferenceRepository;
import fr.cardon.simpleat.repository.RestaurantRepository;

@RestController
@CrossOrigin("*")
public class PreferenceController {

	
	@Autowired
	private PreferenceRepository preferenceRepository;
	
	@Autowired
	private PersonneRepository personneRepository;
	
	@Autowired
	private RestaurantRepository restaurantRepository;
	
	@GetMapping("/preferences")
	public Collection<Preference> findAll(){

		return preferenceRepository.findAll();
	}
	
	
	@GetMapping("/preference/{iduser}/{idrestau}")
	public Optional<Preference> findPreferenceById(@PathVariable int iduser, @PathVariable int idrestau ){
		PreferencePK id = new PreferencePK(personneRepository.getById(iduser) ,restaurantRepository.getById(idrestau));
		System.out.println(iduser);
		return preferenceRepository.findById(id);
	}
	
	
	@PostMapping("/add-preference")
	public ResponseEntity<?> ajoutPreference(@RequestBody Preference preference){
		return ResponseEntity.status(HttpStatus.OK).body(preferenceRepository.save(preference));
	}

	
//	@PutMapping(value = "/update-restaurant/{id}")
//	public ResponseEntity<?> modifPerso(@PathVariable int id, @RequestBody Restaurant personne){
//		return ResponseEntity.status(HttpStatus.OK).body(preferenceRepository.save(personne));
//	}	
//	
	@DeleteMapping("/delete-preference/{idrestau}/{iduser}")
	public void deletePreferenceById(@PathVariable int iduser, @PathVariable int idrestau ){
		PreferencePK id = new PreferencePK(personneRepository.getById(iduser) ,restaurantRepository.getById(idrestau));
		preferenceRepository.deleteById(id);
	}
	
//	@DeleteMapping("/delete-pref-byrestau/{idrestau}")
//	public void deletePreferenceByRestau(@PathVariable int idrestau ){
//		List<Personne> list = personneRepository.findAll();
//		 for (int i = 0; i < list.size(); i++) {
//			 if(findPreferenceById(list.get(i).getId(),idrestau).isEmpty() == false) {
//				 preferenceRepository.deleteById(new PreferencePK(list.get(i),new Restaurant(idrestau)));
//			 }
//			 //System.out.println(findPreferenceById(list.get(i).getId(),idrestau).isEmpty());			
//		}
//		
//	}
}
