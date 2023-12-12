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

import com.example.demo.laundry.dto.TipoServicioDTO;
import com.example.demo.laundry.entity.TipoServicio;
import com.example.demo.laundry.services.TipoServicioService;

@RestController
public class TipoServicioController {
	
	@Autowired
	TipoServicioService tipoServicioService;
	
	@GetMapping("/listarTipoServicio/{id}")
	public Optional<TipoServicio> listarPorId(@PathVariable Integer id){ 
		return tipoServicioService.listarPorId(id);
	}
	
	@GetMapping("/listarTipoServicio")
	public List<TipoServicio> listar() {
		return tipoServicioService.listar();
	}
	
	@PostMapping("/registrarTipoServicio")
	public TipoServicio registrar(@RequestBody TipoServicioDTO tipoServicioDTO) {
		return tipoServicioService.registrar(tipoServicioDTO);
	}
	
	@PutMapping("/actualizarTipoServicio")
	public TipoServicio modificar(@RequestBody TipoServicioDTO tipoServicioDTO) {
		return tipoServicioService.modificar(tipoServicioDTO);
	}

}
