package fr.cardon.simpleat.service;

import java.util.List;
import java.util.Optional;

import org.hibernate.internal.build.AllowSysOut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;



import fr.cardon.simpleat.exception.ExistingUsernameException;
import fr.cardon.simpleat.exception.InvalidCredentialsException;
import fr.cardon.simpleat.model.Personne;
import fr.cardon.simpleat.repository.PersonneRepository;
import fr.cardon.simpleat.security.JwtTokenProvider;



@Service
public class PersonneServiceImpl implements PersonneService {

	@Autowired
    private PersonneRepository personneRepository; // permet communication avec la BD
	
	@Autowired
    private BCryptPasswordEncoder passwordEncoder; // permet l'encodage du mot de passe
	
	@Autowired
	private JwtTokenProvider jwtTokenProvider;	// permet la fourniture du Jeton (Token)
	
	@Autowired
    private AuthenticationManager authenticationManager; // gestionnaire d'authentification


	/**
	 * Permet de se connecter en encodant le mot de passe avec génération du token.
	 */
    @Override
    public String signin(String email, String password) throws InvalidCredentialsException {
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(email, password));
            return jwtTokenProvider.createToken(email, personneRepository.findByEmail(email).get().getRoleList());
        } catch (AuthenticationException e) {
            throw new InvalidCredentialsException();
        }
    }

    @Override
    public String signup(Personne personne) throws ExistingUsernameException {
    	System.out.println(personne .getNom());
        if (!personneRepository.existsByEmail(personne.getEmail())) {
        	System.out.println(personne .getEmail());
        	Personne personneToSave = new Personne(personne.getNom(),personne.getPrenom(),personne.getEmail(), passwordEncoder.encode(personne.getPassword()), personne.getRoleList());
            personneRepository.save(personneToSave);
            return jwtTokenProvider.createToken(personne.getEmail(), personne.getRoleList());
        } else {
            throw new ExistingUsernameException();
        }
    }

    @Override
    public List<Personne> findAllUsers() {
        return personneRepository.findAll();
    }

    @Override
    public Optional<Personne> findUserByEmail(String email) {
        return personneRepository.findByEmail(email);
    }
}
