package fr.cardon.simpleat.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import fr.cardon.simpleat.model.Personne;

import fr.cardon.simpleat.repository.PersonneRepository;


@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private PersonneRepository personneRepository;

    @Override
    public UserDetails loadUserByUsername(String email)  {
        final Optional<Personne> personne = personneRepository.findByEmail(email);

        if (!personne.isPresent()) {
            throw new UsernameNotFoundException("utilisateur '" + email + "' introuvable");
        }

        return User
                .withUsername(email)
                .password(personne.get().getPassword())
                .authorities(personne.get().getRoleList())
                .accountExpired(false)
                .accountLocked(false)
                .credentialsExpired(false)
                .disabled(false)
                .build();
    }
}
