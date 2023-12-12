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

import com.example.demo.laundry.dto.EstadoDTO;
import com.example.demo.laundry.entity.Estado;
import com.example.demo.laundry.services.EstadoService;

@RestController
public class EstadoController {
	
	@Autowired
	EstadoService estadoService;
	
	@GetMapping("/listarEstado/{id}")
	public Optional<Estado> listarPorId(@PathVariable Integer id){ 
		return estadoService.listarPorId(id);
	}
	
	@GetMapping("/listarEstado")
	public List<Estado> listar() {
		return estadoService.listar();
	}
	
	@PostMapping("/registrarEstado")
	public Estado registrar(@RequestBody EstadoDTO estadoDTO) {
		return estadoService.registrar(estadoDTO);
	}
	
	@PutMapping("/actualizarEstado")
	public Estado modificar(@RequestBody EstadoDTO estadoDTO) {
		return estadoService.modificar(estadoDTO);
	}
	

}
