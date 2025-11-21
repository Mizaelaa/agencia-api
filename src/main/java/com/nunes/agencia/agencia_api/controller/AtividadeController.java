package com.nunes.agencia.agencia_api.controller;

import com.nunes.agencia.agencia_api.model.Atividade;
import com.nunes.agencia.agencia_api.service.AtividadeService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/atividades")
public class AtividadeController {


private final AtividadeService atividadeService;

public AtividadeController(AtividadeService atividadeService) {
    this.atividadeService = atividadeService;
}

@GetMapping
public List<Atividade> listarTodos() {
    return atividadeService.listarTodos();
}

@PostMapping
public Atividade salvar(@RequestBody Atividade atividade) {
    return atividadeService.salvar(atividade);
}

@DeleteMapping("/{id}")
public void deletar(@PathVariable Long id) {
    atividadeService.deletar(id);
}


}

