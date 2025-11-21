package com.nunes.agencia.agencia_api.controller;

import com.nunes.agencia.agencia_api.model.Pacote;
import com.nunes.agencia.agencia_api.service.PacoteService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/pacotes")
public class PacoteController {


private final PacoteService pacoteService;

public PacoteController(PacoteService pacoteService) {
    this.pacoteService = pacoteService;
}

@GetMapping
public List<Pacote> listarTodos() {
    return pacoteService.listarTodos();
}

@PostMapping
public Pacote salvar(@RequestBody Pacote pacote) {
    return pacoteService.salvar(pacote);
}

@DeleteMapping("/{id}")
public void deletar(@PathVariable Long id) {
    pacoteService.deletar(id);
}


}

