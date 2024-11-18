package com.project.tokenValid.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "usuario")
public class Usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @Column(name = "id_usuario")
    private Long idUsuario;
    
    @Column
    private String nome;
    
    @Column
    private String contato;
    
    @Column
    private String email;
    
    @Column
    private String login;
    
    @Column
    private String password;
}