package com.nunes.agencia.agencia_api.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class GeradorBCrypt {
    public static void main(String[] args) {
        String hash = new BCryptPasswordEncoder().encode("admin123");
        System.out.println("Hash gerado: " + hash);
    }
}
