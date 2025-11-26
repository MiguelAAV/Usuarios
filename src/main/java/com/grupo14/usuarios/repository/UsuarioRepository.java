package com.grupo14.usuarios.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grupo14.usuarios.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, String> {
    
    // Buscar usuario por correo electrónico
    Optional<Usuario> findByCorreo(String correo);

    // Buscar usuario por nombre
    Optional<Usuario> findByNombre(String nombre);

    // Buscar usuario por rut (aunque ya es la PK, igual se puede definir)
    Optional<Usuario> findByRut(String rut);
}
