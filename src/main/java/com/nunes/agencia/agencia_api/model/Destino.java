package com.nunes.agencia.agencia_api.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Destino {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String descricao;
}
