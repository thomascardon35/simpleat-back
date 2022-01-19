package fr.cardon.simpleat.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.cardon.simpleat.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {


	  Collection<Role> findCollectionById(int id);
	  
}
