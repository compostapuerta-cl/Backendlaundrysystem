package com.example.demo.laundry.services.imp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.laundry.dto.EstadoDTO;
import com.example.demo.laundry.entity.Estado;
import com.example.demo.laundry.repository.EstadoRepository;
import com.example.demo.laundry.services.EstadoService;

@Service
public class EstadoServiceImpl implements EstadoService{
	
	@Autowired
	EstadoRepository estadoRepository;

	@Override
	public Estado registrar(EstadoDTO estadoDTO) {
		
		Estado estado = new Estado();
		
		estado.setName(estadoDTO.getName());
		estado.setCreatedBy(estadoDTO.getCreatedBy());
		estado.setUpdatedBy(estadoDTO.getUpdatedBy());
		
		return estadoRepository.save(estado);
	}

	@Override
	public Estado modificar(EstadoDTO estadoDTO) {
		Estado estado = new Estado();
		estado = estadoRepository.findById(estadoDTO.getId()).orElse(null);
		
		estado.setId(estadoDTO.getId());
		estado.setName(estadoDTO.getName());
		estado.setCreatedBy(estadoDTO.getCreatedBy());
		estado.setUpdatedBy(estadoDTO.getUpdatedBy());
		
		return estadoRepository.save(estado);
	}

	@Override
	public List<Estado> listar() {
		return estadoRepository.findAll();
	}

	@Override
	public Optional<Estado> listarPorId(Integer id) {
		return estadoRepository.findById(id);
	}

	@Override
	public void eliminar(Integer id) {
		estadoRepository.deleteById(id);
	}

}
