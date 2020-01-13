package br.ufms.estagio.server.resource.entity;

import br.ufms.estagio.springbootlib.repository.GenericEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Column;

public abstract class User extends GenericEntity {
    @Column(unique = true)
    private String username;
    @JsonIgnore
    private String password;
    private boolean admin;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }
}
