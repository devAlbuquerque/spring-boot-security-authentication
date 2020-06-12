package com.eventos.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eventos.springapp.models.Convidado;
import com.eventos.springapp.models.Evento;


public interface ConvidadoRepository extends JpaRepository<Convidado, String> {

	Iterable<Convidado> findByEvento(Evento evento);
	Convidado findByRg(String rg);
}
