package com.example.demo.laundry.services.imp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.laundry.dto.ClienteDTO;
import com.example.demo.laundry.entity.Cliente;
import com.example.demo.laundry.repository.ClienteRepository;
import com.example.demo.laundry.services.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService{
	
	@Autowired
	ClienteRepository clienteRepository;

	@Override
	public Cliente registrar(ClienteDTO clienteDTO) {
		
		Cliente cliente = new Cliente();
		
		cliente.setApellido(clienteDTO.getApellido());
		cliente.setName(clienteDTO.getName());
		cliente.setCreatedBy(clienteDTO.getCreatedBy());
		cliente.setUpdatedBy(clienteDTO.getUpdatedBy());
		
		return clienteRepository.save(cliente);
	}

	@Override
	public Cliente modificar(ClienteDTO clienteDTO) {
		
		Cliente cliente = new Cliente();
		cliente = clienteRepository.findById(clienteDTO.getId()).orElse(null);
		
		cliente.setId(clienteDTO.getId());
		cliente.setApellido(clienteDTO.getApellido());
		cliente.setName(clienteDTO.getName());
		cliente.setCreatedBy(clienteDTO.getCreatedBy());
		cliente.setUpdatedBy(clienteDTO.getUpdatedBy());
		
		return clienteRepository.save(cliente);
	}

	@Override
	public List<Cliente> listar() {
		return clienteRepository.findAll();
	}

	@Override
	public Optional<Cliente> listarPorId(Integer id) {
		return clienteRepository.findById(id);
	}

	@Override
	public void eliminar(Integer id) {
		clienteRepository.deleteById(id);
	}

}
