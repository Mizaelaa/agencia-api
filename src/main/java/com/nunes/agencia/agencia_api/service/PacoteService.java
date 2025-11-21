package com.nunes.agencia.agencia_api.service;

import com.nunes.agencia.agencia_api.model.Pacote;
import com.nunes.agencia.agencia_api.repository.PacoteRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PacoteService {

    private final PacoteRepository pacoteRepository;

    public PacoteService(PacoteRepository pacoteRepository) {
        this.pacoteRepository = pacoteRepository;
    }

    public List<Pacote> listarTodos() {
        return pacoteRepository.findAll();
    }

    public Pacote salvar(Pacote pacote) {
        return pacoteRepository.save(pacote);
    }

    public void deletar(Long id) {
        pacoteRepository.deleteById(id);
    }
}

