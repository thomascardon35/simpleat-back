package fr.cardon.simpleat.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.cardon.simpleat.model.Personne;

@Repository
public interface PersonneRepository extends JpaRepository<Personne, Integer> {

	 Personne findById(int id);

	Optional<Personne> findByEmail(String email);

	boolean existsByEmail(String email);

	
	 
}
