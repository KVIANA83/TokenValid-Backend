package com.project.tokenValid.service;

import com.project.tokenValid.dto.UsuarioDTO;
import com.project.tokenValid.model.Usuario;
import com.project.tokenValid.repositories.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;
    private final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
    
    public Usuario salvarUsuario(UsuarioDTO usuarioDTO) {
        
        String senhaCodificada = passwordEncoder.encode(usuarioDTO.getPassword());
        
        Usuario usuario = Usuario.builder()
                .nome(usuarioDTO.getNome())
                .contato(usuarioDTO.getContato())
                .email(usuarioDTO.getEmail())
                .login(usuarioDTO.getLogin())
                .password(usuarioDTO.getPassword()) // Lembre-se de codificar a senha!
                .build();
        return usuarioRepository.save(usuario);
    }

    public Usuario buscarPorEmail(String email) {
        return usuarioRepository.findByEmail(email)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado com o e-mail: "));
    }
}
