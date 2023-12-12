package com.example.demo.laundry.services.imp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.laundry.dto.ServicioEstadoDTO;
import com.example.demo.laundry.entity.Estado;
import com.example.demo.laundry.entity.ServicioEstado;
import com.example.demo.laundry.repository.EstadoRepository;
import com.example.demo.laundry.repository.ServicioEstadoRepository;
import com.example.demo.laundry.services.ServicioEstadoService;

public class ServicioEstadoServiceImpl implements ServicioEstadoService{
	
	@Autowired
	ServicioEstadoRepository servicioEstadoRepository;
	
	@Autowired
	EstadoRepository estadoRepository;


	@Override
	public ServicioEstado registrar(ServicioEstadoDTO servicioEstadoDTO) {
		
		ServicioEstado servicioEstado = new ServicioEstado();
		
		Estado estado;
		estado = estadoRepository.findById(servicioEstadoDTO.getEstado()).orElse(null);
		
		servicioEstado.setCreatedBy(servicioEstadoDTO.getCreatedBy());
		servicioEstado.setUpdatedBy(servicioEstadoDTO.getUpdatedBy());
		servicioEstado.setServicio(servicioEstadoDTO.getServicio());
		servicioEstado.setEstado(estado);
		
		
		return servicioEstadoRepository.save(servicioEstado);
	}

	@Override
	public ServicioEstado modificar(ServicioEstadoDTO servicioEstadoDTO) {
		
		ServicioEstado servicioEstado = new ServicioEstado();
		servicioEstado = servicioEstadoRepository.findById(servicioEstadoDTO.getEstado()).orElse(null);
		
		Estado estado;
		estado = estadoRepository.findById(servicioEstadoDTO.getEstado()).orElse(null);
		
		servicioEstado.setId(servicioEstadoDTO.getId());
		servicioEstado.setCreatedBy(servicioEstadoDTO.getCreatedBy());
		servicioEstado.setUpdatedBy(servicioEstadoDTO.getUpdatedBy());
		servicioEstado.setServicio(servicioEstadoDTO.getServicio());
		servicioEstado.setEstado(estado);
		
		
		return servicioEstadoRepository.save(servicioEstado);
	}

	@Override
	public List<ServicioEstado> listar() {
		return servicioEstadoRepository.findAll();
	}

	@Override
	public Optional<ServicioEstado> listarPorId(Integer id) {
		return servicioEstadoRepository.findById(id);
	}

	@Override
	public void eliminar(Integer id) {
		servicioEstadoRepository.deleteById(id);
	}

}
