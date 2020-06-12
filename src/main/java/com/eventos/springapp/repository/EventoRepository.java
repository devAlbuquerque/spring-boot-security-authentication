package com.eventos.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eventos.springapp.models.Evento;

@Repository
public interface EventoRepository extends JpaRepository<Evento, String> {

	Evento findByCodigo(long codigo);

}
