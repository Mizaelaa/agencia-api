package com.nunes.agencia.agencia_api.controller;

import com.nunes.agencia.agencia_api.model.Destino;
import com.nunes.agencia.agencia_api.service.DestinoService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/destinos")
public class DestinoController {


private final DestinoService destinoService;

public DestinoController(DestinoService destinoService) {
    this.destinoService = destinoService;
}

@GetMapping
public List<Destino> listarTodos() {
    return destinoService.listarTodos();
}

@PostMapping
public Destino salvar(@RequestBody Destino destino) {
    return destinoService.salvar(destino);
}

@DeleteMapping("/{id}")
public void deletar(@PathVariable Long id) {
    destinoService.deletar(id);
}

}
