package com.project.tokenValid.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LoginDTO {
    
    @NotBlank(message = "login é um campo obrigatório!")
    private String login;
    
    @NotBlank(message = "senha é um campo obrigatório!")
    private String password;
}