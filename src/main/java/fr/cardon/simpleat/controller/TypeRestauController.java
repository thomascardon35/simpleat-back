package fr.cardon.simpleat.controller;


import java.util.Collection;
import java.util.List;

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
import org.springframework.web.bind.annotation.RestController;

import fr.cardon.simpleat.model.Restaurant;
import fr.cardon.simpleat.model.TypeRestau;
import fr.cardon.simpleat.repository.TypeRestauRepository;

@RestController
@CrossOrigin("*")
public class TypeRestauController {

    @Autowired
    private TypeRestauRepository typeRestauRepository;

    @GetMapping("/types")
    public Collection<TypeRestau> findAll(){

        return typeRestauRepository.findAll();
    }

    @GetMapping("/type/{id}")
    public TypeRestau findTypetById(@PathVariable int id){
        return typeRestauRepository.findById(id);
    }

    @GetMapping("/restaurantbytype/{id}")
    public List<Restaurant> findRestauByType(@PathVariable int id){
    	return findTypetById(id).getRestaurants();
    }

    @PostMapping("/add-type")
    public ResponseEntity<?> ajoutType(@RequestBody TypeRestau type){
        return ResponseEntity.status(HttpStatus.OK).body(typeRestauRepository.save(type));
    }


    @PutMapping(value = "/update-type/{id}")
    public ResponseEntity<?> modifType(@PathVariable int id, @RequestBody TypeRestau type){
        return ResponseEntity.status(HttpStatus.OK).body(typeRestauRepository.save(type));
    }

    @DeleteMapping(value = "/delete-type/{id}")
    public void suppressionType(@PathVariable int id){

        typeRestauRepository.deleteById(id);
    }

}