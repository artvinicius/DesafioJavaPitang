package com.pitang.desafio.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pitang.desafio.domain.Usuario;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioResource {

	@RequestMapping(method = RequestMethod.GET)
	public List <Usuario> listar() {
		
		Usuario user1 = new Usuario(1, "Arthur", "Vinicius", "art@gmail.com", "23-09-1999", "123", "abc", "XXXXXX");
		
		List <Usuario> lista = new ArrayList<>();
		lista.add(user1);
		
		return lista;
	}

}
