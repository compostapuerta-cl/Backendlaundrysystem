package com.example.demo.laundry.services;

import java.util.List;
import java.util.Optional;

import com.example.demo.laundry.dto.EstadoDTO;
import com.example.demo.laundry.entity.Estado;

public interface EstadoService {
	
	Estado registrar(EstadoDTO estadoDTO);
	Estado modificar(EstadoDTO estadoDTO);
	List<Estado> listar();
	Optional<Estado> listarPorId(Integer id);
	void eliminar(Integer id);


}
