package com.nunes.agencia.agencia_api.controller;

import com.nunes.agencia.agencia_api.model.Destino;
import com.nunes.agencia.agencia_api.repository.DestinoRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/destinos")
public class DestinoController {

    private final DestinoRepository repository;

    public DestinoController(DestinoRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Destino> listar() {
        return repository.findAll();
    }

    @PostMapping
    public Destino salvar(@RequestBody Destino destino) {
        return repository.save(destino);
    }
}
