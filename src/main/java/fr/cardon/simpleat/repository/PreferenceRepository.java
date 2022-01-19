package fr.cardon.simpleat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.cardon.simpleat.model.Preference;
import fr.cardon.simpleat.model.PreferencePK;

@Repository
public interface PreferenceRepository extends JpaRepository<Preference, PreferencePK> {

	
}
