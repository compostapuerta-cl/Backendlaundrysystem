package com.example.demo.laundry.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ServicioEstadoDTO {
	
	private Integer id;
	
	private Integer servicio;
	
	private Integer estado;
	
	private String createdBy;
	
	private String updatedBy;

	public ServicioEstadoDTO(Integer id, Integer servicio, Integer estado, String createdBy, String updatedBy) {
		this.id = id;
		this.servicio = servicio;
		this.estado = estado;
		this.createdBy = createdBy;
		this.updatedBy = updatedBy;
	}

	
	

}
