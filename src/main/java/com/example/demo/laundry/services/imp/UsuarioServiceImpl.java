package com.example.demo.laundry.services.imp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.laundry.dto.UsuarioDTO;
import com.example.demo.laundry.entity.Usuario;
import com.example.demo.laundry.repository.UsuarioRepository;
import com.example.demo.laundry.services.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService{
	
	@Autowired
	UsuarioRepository usuarioRepository;

	@Override
	public Usuario registrar(UsuarioDTO usuarioDTO) {
		
		Usuario usuario = new Usuario();
		
		usuario.setName(usuarioDTO.getName());
		usuario.setApellido(usuarioDTO.getApellido());
		usuario.setCreatedBy(usuarioDTO.getCreatedBy());
		usuario.setUpdatedBy(usuarioDTO.getUpdatedBy());
		
		return usuarioRepository.save(usuario);
	}

	@Override
	public Usuario modificar(UsuarioDTO usuarioDTO) {
		
		Usuario usuario = new Usuario();
		usuario = usuarioRepository.findById(usuarioDTO.getId()).orElse(null);
		
		usuario.setId(usuarioDTO.getId());
		usuario.setName(usuarioDTO.getName());
		usuario.setApellido(usuarioDTO.getApellido());
		usuario.setCreatedBy(usuarioDTO.getCreatedBy());
		usuario.setUpdatedBy(usuarioDTO.getUpdatedBy());
		
		return usuarioRepository.save(usuario);
	}

	@Override
	public List<Usuario> listar() {
		return usuarioRepository.findAll();
	}

	@Override
	public Optional<Usuario> listarPorId(Integer id) {
		return usuarioRepository.findById(id);
	}

	@Override
	public void eliminar(Integer id) {
		usuarioRepository.deleteById(id);
	}

}
