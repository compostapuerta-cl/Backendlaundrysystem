package com.example.demo.laundry.services;

import java.util.List;
import java.util.Optional;

import com.example.demo.laundry.dto.UsuarioDTO;
import com.example.demo.laundry.entity.Usuario;


public interface UsuarioService {
	
		Usuario registrar(UsuarioDTO usuarioDTO);
		Usuario modificar(UsuarioDTO usuarioDTO);
		List<Usuario> listar();
		Optional<Usuario> listarPorId(Integer id);
		void eliminar(Integer id);
}
