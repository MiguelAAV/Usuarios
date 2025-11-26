package com.grupo14.usuarios.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "usuarios")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {

    @Id
    @Column(length = 12, nullable = false, unique = true)
    private String rut; 
    // Usamos rut como clave primaria (en Chile es único).
    // length=12 para cubrir formato con puntos y guion.

    @Column(nullable = false, length = 50)
    private String nombre;
    // Nombre del usuario, obligatorio, hasta 50 caracteres.

    @Column(nullable = false, length = 50)
    private String apellido;
    // Apellido del usuario, obligatorio, hasta 50 caracteres.

    @Column(nullable = false, unique = true, length = 100)
    private String correo;
    // Correo electrónico, obligatorio y único, hasta 100 caracteres.

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @Column(nullable = false, length = 255)
    private String contrasena;
    // Contraseña, no se devuelve en JSON, se guarda en BD.
    // length=255 para permitir hash seguro (ej. BCrypt).

    @Column(nullable = false, length = 100)
    private String empresa;
    // Empresa donde trabaja el usuario.

    @Column(nullable = false, length = 50)
    private String cargo;
    // Cargo del usuario dentro de la empresa.

    @Column(nullable = false, length = 50)
    private String depto;
    // Departamento al que pertenece el usuario.
}
