package com.Project.Spring.Security.Entities;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name="user")
public class User implements UserDetails {
    @Id
  @GeneratedValue (strategy = GenerationType.IDENTITY)
   @Column(name="user_Id")
    private Long Id;

    @Column(name="user-name")
    private String name;

    @Column(name="user-email")
    private String email;

    @Column(name="user-password")
    private String password;

//    @ManyToOne
//    @JoinColumn(name="admin-Id")
//    private Admin admin;



    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getUsername() {
        return this.email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
