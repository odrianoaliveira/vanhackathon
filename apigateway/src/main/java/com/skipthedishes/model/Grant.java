package com.skipthedishes.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;

/**
 * Created by adriano on 18/03/18.
 *
 * @author Adriano Oliveira
 */

@Data
@Builder
public class Grant implements GrantedAuthority {

    public enum Role {
        CONSUMER("consumer"),
        ADMIN("admin");

        private String text;

        Role(final String text) {
            this.text = text;
        }

        @Override
        public String toString() {
            return text;
        }
    }

    private Role role;

    @Override
    public String getAuthority() {
        return role.toString();
    }

}
