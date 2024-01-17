package com.API.estoque.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import com.API.estoque.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

	UserDetails findByLogin(String login);
}
