package com.Project.Spring.Security.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class JwtResponse {
    private String jwtToken;
    private String username;


    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private JwtResponse jwtResponse;

        private Builder() {
            jwtResponse = new JwtResponse();
        }

        public Builder jwtToken(String jwtToken) {
            jwtResponse.jwtToken = jwtToken;
            return this;
        }

        public Builder username(String username) {
            jwtResponse.username = username;
            return this;
        }

        public JwtResponse build() {
            return jwtResponse;
        }
    }
}
