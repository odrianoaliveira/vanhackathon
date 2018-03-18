package com.skipthedishes.service;

import com.skipthedishes.config.AuthProps;
import com.skipthedishes.model.Grant;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * Created by adriano on 18/03/18.
 *
 * @author Adriano Oliveira
 */

@Component
@RequiredArgsConstructor
public class SimpleAuthProviderService implements AuthenticationProvider {
    private static final String CREDENTIALS_ERROR_MESSAGE = "invalid user or password";

    private final AuthProps authProps;
    private final PasswordEncoder passwordEncoder;

    @Override
    public Authentication authenticate(Authentication authentication) {
        if (authentication.getPrincipal() == null || authentication.getCredentials() == null)
            throw new UsernameNotFoundException(CREDENTIALS_ERROR_MESSAGE);

        final String login = authentication.getPrincipal().toString();
        final String pwd = passwordEncoder.encode(authentication.getCredentials().toString());

        //Let's rock with Java 8 ;)
        final List userList = authProps.getUsers().entrySet()
                .stream()
                .map(item -> (LinkedHashMap) item.getValue())
                .filter(item -> item.containsKey(login))
                .map(item -> (LinkedHashMap) item.get(login))
                .collect(toList());

        if (userList.isEmpty()) throw new UsernameNotFoundException(CREDENTIALS_ERROR_MESSAGE);

        final LinkedHashMap userMap = (LinkedHashMap) userList.get(0);
        final String pwdHash = userMap.get("password").toString();

        if (StringUtils.isBlank(pwdHash) || passwordEncoder.matches(pwd, pwdHash))
            throw new BadCredentialsException(CREDENTIALS_ERROR_MESSAGE);

        final String role = userMap.get("role").toString();
        final List<Grant> authorities = new ArrayList<>();
        final Grant grant = Grant.builder().role(Grant.Role.valueOf(role.toUpperCase())).build();
        authorities.add(grant);
        return new UsernamePasswordAuthenticationToken(login, null, authorities);
    }

    @Override
    public boolean supports(Class<?> auth) {
        return auth.equals(UsernamePasswordAuthenticationToken.class);
    }

}
