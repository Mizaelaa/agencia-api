package com.nunes.agencia.agencia_api.service;

import com.nunes.agencia.agencia_api.model.Hotel;
import com.nunes.agencia.agencia_api.repository.HotelRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class HotelService {

    private final HotelRepository hotelRepository;

    public HotelService(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    public List<Hotel> listarTodos() {
        return hotelRepository.findAll();
    }

    public Hotel salvar(Hotel hotel) {
        return hotelRepository.save(hotel);
    }

    public void deletar(Long id) {
        hotelRepository.deleteById(id);
    }
}
