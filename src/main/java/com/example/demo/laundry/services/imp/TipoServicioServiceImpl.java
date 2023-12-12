package com.example.demo.laundry.services.imp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.laundry.dto.TipoServicioDTO;
import com.example.demo.laundry.entity.TipoServicio;
import com.example.demo.laundry.repository.TipoServicioRepository;
import com.example.demo.laundry.services.TipoServicioService;

@Service
public class TipoServicioServiceImpl implements TipoServicioService{
	
	@Autowired
	TipoServicioRepository tipoServicioRepository;

	@Override
	public TipoServicio registrar(TipoServicioDTO tipoServicioDTO) {
		
		TipoServicio tipoServicio = new TipoServicio();
		
		tipoServicio.setName(tipoServicioDTO.getName());
		tipoServicio.setCreatedBy(tipoServicioDTO.getCreatedBy());
		tipoServicio.setUpdatedBy(tipoServicioDTO.getUpdatedBy());
		
		return tipoServicioRepository.save(tipoServicio);
	}

	@Override
	public TipoServicio modificar(TipoServicioDTO tipoServicioDTO) {
		
		TipoServicio tipoServicio = new TipoServicio();
		tipoServicio = tipoServicioRepository.findById(tipoServicioDTO.getId()).orElse(null);
		
		tipoServicio.setId(tipoServicioDTO.getId());
		tipoServicio.setName(tipoServicioDTO.getName());
		tipoServicio.setCreatedBy(tipoServicioDTO.getCreatedBy());
		tipoServicio.setUpdatedBy(tipoServicioDTO.getUpdatedBy());
		
		return tipoServicioRepository.save(tipoServicio);
	}

	@Override
	public List<TipoServicio> listar() {
		return tipoServicioRepository.findAll();
	}

	@Override
	public Optional<TipoServicio> listarPorId(Integer id) {
		return tipoServicioRepository.findById(id);
	}

	@Override
	public void eliminar(Integer id) {
		tipoServicioRepository.deleteById(id);
	}

}
