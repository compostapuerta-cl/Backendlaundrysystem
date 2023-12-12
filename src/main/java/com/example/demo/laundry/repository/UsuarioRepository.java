package com.example.demo.laundry.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.laundry.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

}
