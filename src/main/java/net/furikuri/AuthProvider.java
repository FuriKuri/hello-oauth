package net.furikuri;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.Arrays;

public class AuthProvider implements AuthenticationProvider {
    @Override
    public Authentication authenticate(final Authentication authentication) throws AuthenticationException {
        String username = authentication.getPrincipal() + "";
        String password = authentication.getCredentials() + "";
        if (username.equalsIgnoreCase(password)) {
            return new UsernamePasswordAuthenticationToken(username, password, Arrays.asList(new
                    SimpleGrantedAuthority("ROLE_USER")));
        } else {
            throw new BadCredentialsException("Error");

        }
    }

    @Override
    public boolean supports(final Class<?> authentication) {
        return true;
    }
}
