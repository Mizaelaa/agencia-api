package com.nunes.agencia.agencia_api.service;

import com.nunes.agencia.agencia_api.model.Usuario;
import com.nunes.agencia.agencia_api.repository.UsuarioRepository;
import org.springframework.security.core.userdetails.*;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Service;
import java.util.stream.Collectors;

@Service
public class UsuarioService implements UserDetailsService {


private final UsuarioRepository usuarioRepository;

public UsuarioService(UsuarioRepository usuarioRepository) {
    this.usuarioRepository = usuarioRepository;
}

@Override
public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

    Usuario usuario = usuarioRepository.findByUsername(username)
            .orElseThrow(() -> new UsernameNotFoundException("Usuário não encontrado"));

    return new org.springframework.security.core.userdetails.User(
            usuario.getUsername(),
            usuario.getSenha(),
            usuario.getPerfis().stream()
                    .map(p -> new SimpleGrantedAuthority(p.getNome()))
                    .collect(Collectors.toList())
    );
}

}

