package com.eventos.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eventos.springapp.models.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, String> {

	Usuario findByLogin(String login);

}
