package com.example.demo.laundry.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UsuarioDTO {
	
	private Integer id;
	
	private String name;
	
	private String apellido;
		
	private String createdBy;
	
	private String updatedBy;

	public UsuarioDTO(Integer id, String name, String apellido, String createdBy, String updatedBy) {
		this.id = id;
		this.name = name;
		this.apellido = apellido;
		this.createdBy = createdBy;
		this.updatedBy = updatedBy;
	}


	
	

}
