package com.pitang.desafio.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.pitang.desafio.domain.Usuario;

@Repository
@EnableJpaRepositories
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

	List<Usuario> findByNome(String nome);
	
	List<Usuario> findByNomeContaining(String nome);

	boolean existsById(Long clienteId);
	
}
