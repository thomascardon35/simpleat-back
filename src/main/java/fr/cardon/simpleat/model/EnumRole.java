package fr.cardon.simpleat.model;

import org.springframework.security.core.GrantedAuthority;

public enum EnumRole implements GrantedAuthority {
	
    ROLE_ADMIN, ROLE_CREATOR, ROLE_READER;

    @Override
    public String getAuthority() {
        return name();
    }

}
