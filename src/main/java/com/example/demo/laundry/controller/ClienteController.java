package com.example.demo.laundry.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.laundry.dto.ClienteDTO;
import com.example.demo.laundry.entity.Cliente;
import com.example.demo.laundry.services.ClienteService;


@RestController
public class ClienteController {
	
	
	@Autowired
	ClienteService clienteService;
	
	@GetMapping("/listarCliente/{id}")
	public Optional<Cliente> listarPorId(@PathVariable Integer id){ 
		return clienteService.listarPorId(id);
	}
	
	@GetMapping("/listarCliente")
	public List<Cliente> listar() {
		return clienteService.listar();
	}
	
	@PostMapping("/registrarPedido")
	public Cliente registrar(@RequestBody ClienteDTO clienteDTO) {
		return clienteService.registrar(clienteDTO);
	}
	
	@PutMapping("/actualizarPedido")
	public Cliente modificar(@RequestBody ClienteDTO clienteDTO) {
		return clienteService.modificar(clienteDTO);
	}


}
