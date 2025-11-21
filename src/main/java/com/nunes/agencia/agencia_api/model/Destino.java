package com.nunes.agencia.agencia_api.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Destino {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao;

    @OneToMany(mappedBy = "destino", cascade = CascadeType.ALL)
    private List<Pacote> pacotes;

    @OneToMany(mappedBy = "destino", cascade = CascadeType.ALL)
    private List<Hotel> hoteis;

    @OneToMany(mappedBy = "destino", cascade = CascadeType.ALL)
    private List<Atividade> atividades;

    // getters e setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
    public List<Pacote> getPacotes() { return pacotes; }
    public void setPacotes(List<Pacote> pacotes) { this.pacotes = pacotes; }
    public List<Hotel> getHoteis() { return hoteis; }
    public void setHoteis(List<Hotel> hoteis) { this.hoteis = hoteis; }
    public List<Atividade> getAtividades() { return atividades; }
    public void setAtividades(List<Atividade> atividades) { this.atividades = atividades; }
}
