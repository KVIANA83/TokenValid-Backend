package com.project.tokenValid.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioDTO {
    
    @NotBlank(message = "O campo nome é obrigatório.") 
    private String nome;
    
    @NotBlank(message = "O campo contato é obrigatório.")
    private String contato;
    
    @NotBlank(message = "O campo e-mail é obrigatório.")
    @jakarta.validation.constraints.Email(message = "Formato de e-mail inválido.")
    private String email;
    
    @NotBlank(message = "O campo login é obrigatório.")
    private String login; 
    
    @NotBlank(message = "O campo password é obrigatório.")
    private String password;
}