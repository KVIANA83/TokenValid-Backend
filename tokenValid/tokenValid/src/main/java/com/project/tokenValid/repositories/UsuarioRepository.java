package com.project.tokenValid.repositories;

import com.project.tokenValid.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    Optional<Usuario> findByLogin(String login);
    
    Optional<Usuario> findByEmail(String email);
    
    Optional<Usuario> findByContato(String contato);
}