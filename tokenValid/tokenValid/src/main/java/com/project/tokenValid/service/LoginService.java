package com.project.tokenValid.service;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@RequiredArgsConstructor
public class LoginService {

    private final String secretKey = "minha-chave-secreta";

    public String autenticar(String login, String password) {
        // Substitua esta lógica pelo acesso ao banco de dados ou outro mecanismo de autenticação
        if ("usuario@example.com".equals(login) && "senha123".equals(password)) {
            long expirationTime = 86400000; // 1 dia em milissegundos

            // Geração do token JWT
            return Jwts.builder()
                    .setSubject(login)
                    .setIssuedAt(new Date())
                    .setExpiration(new Date(System.currentTimeMillis() + expirationTime))
                    .signWith(SignatureAlgorithm.HS512, secretKey)
                    .compact();
        }
        throw new RuntimeException("Credenciais inválidas");
    }
}
