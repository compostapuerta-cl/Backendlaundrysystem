package com.example.demo.laundry.services;

import java.util.List;
import java.util.Optional;

import com.example.demo.laundry.dto.ClienteDTO;
import com.example.demo.laundry.entity.Cliente;


public interface ClienteService {
	
	Cliente registrar(ClienteDTO clienteDTO);
	Cliente modificar(ClienteDTO clienteDTO);
	List<Cliente> listar();
	Optional<Cliente> listarPorId(Integer id);
	void eliminar(Integer id);

}
