package fr.cardon.simpleat.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import fr.cardon.simpleat.exception.ExistingUsernameException;
import fr.cardon.simpleat.exception.InvalidCredentialsException;
import fr.cardon.simpleat.model.Personne;



@Service
public interface PersonneService {

    /**
     * Methode qui permet à un utilisateur de se connecter.
     * @param email : mail de l'utilisateur.
     * @param password : mot de passe de l'utilisateur.
     * @returnun JWT si credentials est valide, throws InvalidCredentialsException otherwise.
     * @throws InvalidCredentialsException
     */
    String signin(String email, String password) throws InvalidCredentialsException;

    /**
     * Methode qui permet de s'inscrire.
     * @param user nouvel utilisateur.
     * @return un JWT si user n'existe pas déjà !
     * @throws ExistingUsernameException
     */
    String signup(Personne personne) throws ExistingUsernameException;

    /**
     * Methode qui retourne tous les utilisateurs de la bd
     * @return the list of all application users.
     */
    List<Personne> findAllUsers();

    /**
     * Methode qui retourne un utilisateur à partir de son username
     * @param username the username to look for.
     * @return an Optional object containing user if found, empty otherwise.
     */
  

	Optional<Personne> findUserByEmail(String email);
}
