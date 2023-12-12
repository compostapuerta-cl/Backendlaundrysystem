package com.example.demo.laundry.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.laundry.dto.UsuarioDTO;
import com.example.demo.laundry.entity.Usuario;
import com.example.demo.laundry.services.UsuarioService;

@RestController
public class UsuarioController {
	
	@Autowired
	UsuarioService usuarioService;
	
	@GetMapping("/listarUsuario/{id}")
	public Optional<Usuario> listarPorId(@PathVariable Integer id){ 
		return usuarioService.listarPorId(id);
	}
	
	@GetMapping("/listarUsuario")
	public List<Usuario> listar() {
		return usuarioService.listar();
	}
	
	@PostMapping("/registrarUsuario")
	public Usuario registrar(@RequestBody UsuarioDTO usuarioDTO) {
		return usuarioService.registrar(usuarioDTO);
	}
	
	@PutMapping("/actualizarUsuario")
	public Usuario modificar(@RequestBody UsuarioDTO usuarioDTO) {
		return usuarioService.modificar(usuarioDTO);
	}


}
