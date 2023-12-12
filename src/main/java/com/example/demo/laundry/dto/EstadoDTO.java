package com.example.demo.laundry.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class EstadoDTO {
	
	private Integer id;
	
	private String name;
		
	private String createdBy;
	
	private String updatedBy;

	public EstadoDTO(Integer id, String name, String createdBy, String updatedBy) {
		this.id = id;
		this.name = name;
		this.createdBy = createdBy;
		this.updatedBy = updatedBy;
	}
	
	


}
