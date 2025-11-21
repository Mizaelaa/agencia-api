package com.nunes.agencia.agencia_api.model;


import jakarta.persistence.*;

@Entity
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private int estrelas;

    @ManyToOne
    @JoinColumn(name = "destino_id")
    private Destino destino;

    // getters e setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public int getEstrelas() { return estrelas; }
    public void setEstrelas(int estrelas) { this.estrelas = estrelas; }
    public Destino getDestino() { return destino; }
    public void setDestino(Destino destino) { this.destino = destino; }
}

