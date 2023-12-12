package com.example.demo.laundry.services.imp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.laundry.dto.ServicioDTO;
import com.example.demo.laundry.entity.Cliente;
import com.example.demo.laundry.entity.Servicio;
import com.example.demo.laundry.entity.TipoServicio;
import com.example.demo.laundry.entity.Usuario;
import com.example.demo.laundry.repository.ClienteRepository;
import com.example.demo.laundry.repository.ServicioRepository;
import com.example.demo.laundry.repository.TipoServicioRepository;
import com.example.demo.laundry.repository.UsuarioRepository;
import com.example.demo.laundry.services.ServicioService;

@Service
public class ServicioServiceImpl implements ServicioService{
	
	@Autowired
	ServicioRepository servicioRepository;
	
	@Autowired
	ClienteRepository clienteRepository;
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	@Autowired
	TipoServicioRepository tipoServicioRepository;

	@Override
	public Servicio registrar(ServicioDTO servicioDTO) {
		
		Servicio servicio = new Servicio();
		
		Cliente cliente;
		cliente = clienteRepository.findById(servicioDTO.getCliente()).orElse(null);
		
		Usuario usuario;
		usuario = usuarioRepository.findById(servicioDTO.getUsuario()).orElse(null);
		
		TipoServicio tipoServicio;
		tipoServicio = tipoServicioRepository.findById(servicioDTO.getCliente()).orElse(null);
		
		
		servicio.setAcuenta(servicioDTO.getAcuenta());
		servicio.setCancelado(servicioDTO.getCancelado());
		servicio.setCreatedBy(servicioDTO.getCreatedBy());
		servicio.setDescripcion(servicioDTO.getDescripcion());
		servicio.setFechaentrega(servicioDTO.getFechaentrega());
		servicio.setFecharecepcion(servicioDTO.getFecharecepcion());
		servicio.setNumeroguia(servicioDTO.getNumeroguia());
		servicio.setObservaciones(servicioDTO.getObservaciones());
		servicio.setPrecio(servicioDTO.getPrecio());
		servicio.setUpdatedBy(servicioDTO.getUpdatedBy());
		
		servicio.setCliente(cliente);
		servicio.setUsuario(usuario);
		servicio.setTipoServicio(tipoServicio);
		
		return servicioRepository.save(servicio);
	}

	@Override
	public Servicio modificar(ServicioDTO servicioDTO) {
		
		Servicio servicio = new Servicio();
		servicio = servicioRepository.findById(servicioDTO.getId()).orElse(null);
		
		Cliente cliente;
		cliente = clienteRepository.findById(servicioDTO.getCliente()).orElse(null);
		
		Usuario usuario;
		usuario = usuarioRepository.findById(servicioDTO.getUsuario()).orElse(null);
		
		TipoServicio tipoServicio;
		tipoServicio = tipoServicioRepository.findById(servicioDTO.getCliente()).orElse(null);
		
		servicio.setId(servicioDTO.getId());
		servicio.setAcuenta(servicioDTO.getAcuenta());
		servicio.setCancelado(servicioDTO.getCancelado());
		servicio.setCreatedBy(servicioDTO.getCreatedBy());
		servicio.setDescripcion(servicioDTO.getDescripcion());
		servicio.setFechaentrega(servicioDTO.getFechaentrega());
		servicio.setFecharecepcion(servicioDTO.getFecharecepcion());
		servicio.setNumeroguia(servicioDTO.getNumeroguia());
		servicio.setObservaciones(servicioDTO.getObservaciones());
		servicio.setPrecio(servicioDTO.getPrecio());
		servicio.setUpdatedBy(servicioDTO.getUpdatedBy());
		
		servicio.setCliente(cliente);
		servicio.setUsuario(usuario);
		servicio.setTipoServicio(tipoServicio);
		
		return servicioRepository.save(servicio);
	}

	@Override
	public List<Servicio> listar() {
		return servicioRepository.findAll();
	}

	@Override
	public Optional<Servicio> listarPorId(Integer id) {
		return servicioRepository.findById(id);
	}

	@Override
	public void eliminar(Integer id) {
		servicioRepository.deleteById(id);
	}

}
