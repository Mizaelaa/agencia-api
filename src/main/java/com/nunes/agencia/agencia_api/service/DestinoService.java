package com.nunes.agencia.agencia_api.service;

import com.nunes.agencia.agencia_api.model.Destino;
import com.nunes.agencia.agencia_api.repository.DestinoRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DestinoService {

    private final DestinoRepository destinoRepository;

    public DestinoService(DestinoRepository destinoRepository) {
        this.destinoRepository = destinoRepository;
    }

    public List<Destino> listarTodos() {
        return destinoRepository.findAll();
    }

    public Destino salvar(Destino destino) {
        return destinoRepository.save(destino);
    }

    public void deletar(Long id) {
        destinoRepository.deleteById(id);
    }
}

