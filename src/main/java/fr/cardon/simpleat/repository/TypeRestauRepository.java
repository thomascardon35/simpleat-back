package fr.cardon.simpleat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.cardon.simpleat.model.TypeRestau;

@Repository
public interface TypeRestauRepository extends JpaRepository<TypeRestau, Integer> {

	
	TypeRestau findById(int id);
}
