package com.nunes.agencia.agencia_api.controller;

import com.nunes.agencia.agencia_api.model.Hotel;
import com.nunes.agencia.agencia_api.service.HotelService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/hoteis")
public class HotelController {


private final HotelService hotelService;

public HotelController(HotelService hotelService) {
    this.hotelService = hotelService;
}

@GetMapping
public List<Hotel> listarTodos() {
    return hotelService.listarTodos();
}

@PostMapping
public Hotel salvar(@RequestBody Hotel hotel) {
    return hotelService.salvar(hotel);
}

@DeleteMapping("/{id}")
public void deletar(@PathVariable Long id) {
    hotelService.deletar(id);
}


}

