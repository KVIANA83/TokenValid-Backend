package com.project.tokenValid.controller;

import com.project.tokenValid.dto.UsuarioDTO;
import com.project.tokenValid.model.Usuario;
import com.project.tokenValid.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/usuario")
public class UsuarioController {

    private final UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity<Usuario> criarUsuario(@RequestBody UsuarioDTO usuarioDTO) {
        Usuario usuario = usuarioService.salvarUsuario(usuarioDTO);
        return ResponseEntity.ok(usuario);
    }

    @GetMapping("/{email}")
    public ResponseEntity<Usuario> buscarUsuarioPorEmail(@PathVariable String email) {
        Usuario usuario = usuarioService.buscarPorEmail(email);
        return ResponseEntity.ok(usuario);
    }
}
