package com.nunes.agencia.agencia_api.config;

import com.nunes.agencia.agencia_api.service.UsuarioService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {


private final UsuarioService usuarioService;

public SecurityConfig(UsuarioService usuarioService) {
    this.usuarioService = usuarioService;
}

@Bean
public PasswordEncoder passwordEncoder() {
    return new BCryptPasswordEncoder();
}

@Bean
public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

    http
        .csrf(csrf -> csrf.disable())
        .authorizeHttpRequests(auth -> auth
            // libera tudo que seu front precisa
            .requestMatchers(
                "/",             // raiz
                "/index.html",   // sua página
                "/script.js",    // seu JS
                "/css/**",
                "/js/**",
                "/images/**",
                "/login"         // página de login do Spring
            ).permitAll()

            // protege suas APIs
            .requestMatchers(
                "/api/destinos/**",
                "/api/pacotes/**",
                "/api/hoteis/**",
                "/api/atividades/**"
            ).hasAnyRole("USER", "ADMIN")

            .anyRequest().authenticated()
        )

        // usa o login padrão do Spring (não o /login custom)
        .formLogin(form -> form
            .defaultSuccessUrl("/", true)
            .permitAll()
        )

        .logout(logout -> logout.permitAll());

    return http.build();
}


@Bean
public AuthenticationManager authManager(HttpSecurity http) throws Exception {
    return http.getSharedObject(AuthenticationManagerBuilder.class)
            .userDetailsService(usuarioService)
            .passwordEncoder(passwordEncoder())
            .and()
            .build();
}


}
