package com.nunes.agencia.agencia_api.service;

import com.nunes.agencia.agencia_api.model.Atividade;
import com.nunes.agencia.agencia_api.repository.AtividadeRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AtividadeService {

    private final AtividadeRepository atividadeRepository;

    public AtividadeService(AtividadeRepository atividadeRepository) {
        this.atividadeRepository = atividadeRepository;
    }

    public List<Atividade> listarTodos() {
        return atividadeRepository.findAll();
    }

    public Atividade salvar(Atividade atividade) {
        return atividadeRepository.save(atividade);
    }

    public void deletar(Long id) {
        atividadeRepository.deleteById(id);
    }
}
