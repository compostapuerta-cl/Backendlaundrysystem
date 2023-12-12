package com.example.demo.laundry.services;

import java.util.List;
import java.util.Optional;

import com.example.demo.laundry.dto.TipoServicioDTO;
import com.example.demo.laundry.entity.TipoServicio;

public interface TipoServicioService {
	
	TipoServicio registrar(TipoServicioDTO tipoServicioDTO);
	TipoServicio modificar(TipoServicioDTO tipoServicioDTO);
	List<TipoServicio> listar();
	Optional<TipoServicio> listarPorId(Integer id);
	void eliminar(Integer id);


}
