package com.example.demo.laundry.services;

import java.util.List;
import java.util.Optional;

import com.example.demo.laundry.dto.ServicioDTO;
import com.example.demo.laundry.entity.Servicio;

public interface ServicioService {
	
	Servicio registrar(ServicioDTO servicioDTO);
	Servicio modificar(ServicioDTO servicioDTO);
	List<Servicio> listar();
	Optional<Servicio> listarPorId(Integer id);
	void eliminar(Integer id);

}
