package com.pitang.desafio.resources;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.pitang.desafio.domain.Usuario;
import com.pitang.desafio.repositories.UsuarioRepository;

@RestController
@RequestMapping(value = "/api/users")
public class UsuarioResource {

	private UsuarioRepository usuarioRepository;

	@GetMapping("/api/users/{id}")
	public ResponseEntity<Usuario> buscar(@PathVariable Integer id) {
		Optional<Usuario> usuario = usuarioRepository.findById(id);

		return ResponseEntity.notFound().build();
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED) // Retornando o cabeçalho de created 201
	public Usuario adicionar(@RequestBody Usuario cliente) {
		return usuarioRepository.save(cliente);
	}

	@PutMapping("/api/users/{id}")
	public ResponseEntity<Usuario> atualizar(@PathVariable Integer id, @RequestBody Usuario usuario) {

		if (!usuarioRepository.existsById(id)) {
			return ResponseEntity.notFound().build();
		}
		usuario.setId(id);
		usuario = usuarioRepository.save(usuario);

		return ResponseEntity.ok(usuario);

	}

	@DeleteMapping("/api/users/{id}")
	public ResponseEntity<Void> remover(@PathVariable Integer id) {

		if (!usuarioRepository.existsById(id)) {
			return ResponseEntity.notFound().build();
		}

		usuarioRepository.deleteById(id);

		return ResponseEntity.noContent().build();
	}

}
