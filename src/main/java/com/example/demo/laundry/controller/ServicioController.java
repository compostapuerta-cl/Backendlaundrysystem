package com.example.demo.laundry.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.laundry.dto.ServicioDTO;
import com.example.demo.laundry.entity.Servicio;
import com.example.demo.laundry.services.ServicioService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class ServicioController {

	@Autowired
	ServicioService servicioService;
	
	@GetMapping("/listarServicio/{id}")
	public Optional<Servicio> listarPorId(@PathVariable Integer id){ 
		return servicioService.listarPorId(id);
	}
	
	
	@GetMapping("/listarServicio")
	public List<Servicio> listar() {
		return servicioService.listar();
	}
	
	@PostMapping("/registrarServicio")
	public Servicio registrar(@RequestBody ServicioDTO servicioDTO) {
		return servicioService.registrar(servicioDTO);
	}
	
	@PutMapping("/actualizarServicio")
	public Servicio modificar(@RequestBody ServicioDTO servicioDTO) {
		return servicioService.modificar(servicioDTO);
	}
}
