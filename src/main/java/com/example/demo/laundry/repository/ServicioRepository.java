package com.example.demo.laundry.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.laundry.entity.Servicio;

@Repository
public interface ServicioRepository extends JpaRepository<Servicio, Integer>{

}
