package br.com.treinaweb.ediaristas.core.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.treinaweb.ediaristas.core.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    
    // spring data jpa -> query methods
    // create sql query based on the name of the method
    Optional<Usuario> findByEmail(String email);

    // jpa query
    @Query("SELECT count(*) > 0 FROM Usuario u WHERE u.email = :email and (:id is null or u.id != :id)")
    Boolean isEmailJaCadastrado(String email, Long id);

}
