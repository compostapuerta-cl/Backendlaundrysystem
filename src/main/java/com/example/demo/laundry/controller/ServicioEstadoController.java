package com.example.demo.laundry.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.laundry.dto.ServicioEstadoDTO;
import com.example.demo.laundry.entity.ServicioEstado;
import com.example.demo.laundry.services.ServicioEstadoService;

public class ServicioEstadoController {
	
	@Autowired
	ServicioEstadoService servicioEstadoService;
	
	@GetMapping("/listarServicio/{id}")
	public Optional<ServicioEstado> listarPorId(@PathVariable Integer id){ 
		return servicioEstadoService.listarPorId(id);
	}
	
	@GetMapping("/listarServicio")
	public List<ServicioEstado> listar() {
		return servicioEstadoService.listar();
	}
	
	@PostMapping("/registrarServicio")
	public ServicioEstado registrar(@RequestBody ServicioEstadoDTO servicioEstadoDTO) {
		return servicioEstadoService.registrar(servicioEstadoDTO);
	}
	
	@PutMapping("/actualizarServicio")
	public ServicioEstado modificar(@RequestBody ServicioEstadoDTO servicioEstadoDTO) {
		return servicioEstadoService.modificar(servicioEstadoDTO);
	}
}


