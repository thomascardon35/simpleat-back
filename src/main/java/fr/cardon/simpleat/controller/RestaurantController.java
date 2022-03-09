package fr.cardon.simpleat.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.cardon.simpleat.model.Restaurant;
import fr.cardon.simpleat.repository.RestaurantRepository;

@RestController
@CrossOrigin("*")
public class RestaurantController {

	
	@Autowired
	private RestaurantRepository restaurantRepository;
	
	@GetMapping("/restaurants")
	public Collection<Restaurant> findAll(){
		return restaurantRepository.findAll();
	}
	
	@GetMapping("/restaurant/{id}")
	public Restaurant findRestaurantById(@PathVariable int id){
		return restaurantRepository.findById(id);
	}
	
	@PostMapping("/add-restaurant")
	//@PreAuthorize("hasRole('ROLE_ADMIN')")
	public ResponseEntity<?> ajoutRestaurant(@RequestBody Restaurant personne){
		return ResponseEntity.status(HttpStatus.OK).body(restaurantRepository.save(personne));
	}

	
	@PutMapping(value = "/update-restaurant/{id}")
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	public ResponseEntity<?> modifRestaurant(@PathVariable int id, @RequestBody Restaurant personne){
		return ResponseEntity.status(HttpStatus.OK).body(restaurantRepository.save(personne));
	}	
	
	@DeleteMapping(value = "/delete-restaurant/{id}")
	public void suppressionRestaurant(@PathVariable int id){
		
		restaurantRepository.deleteById(id);
	}


}
