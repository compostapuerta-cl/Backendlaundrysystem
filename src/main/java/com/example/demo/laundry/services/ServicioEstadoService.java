package com.example.demo.laundry.services;

import java.util.List;
import java.util.Optional;

import com.example.demo.laundry.dto.ServicioDTO;
import com.example.demo.laundry.dto.ServicioEstadoDTO;
import com.example.demo.laundry.entity.Servicio;
import com.example.demo.laundry.entity.ServicioEstado;

public interface ServicioEstadoService {
	
	ServicioEstado registrar(ServicioEstadoDTO servicioEstadoDTO);
	ServicioEstado modificar(ServicioEstadoDTO servicioEstadoDTO);
	List<ServicioEstado> listar();
	Optional<ServicioEstado> listarPorId(Integer id);
	void eliminar(Integer id);

}
