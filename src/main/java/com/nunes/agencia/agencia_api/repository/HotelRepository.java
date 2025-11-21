package com.nunes.agencia.agencia_api.repository;


import com.nunes.agencia.agencia_api.model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotel, Long> {}
