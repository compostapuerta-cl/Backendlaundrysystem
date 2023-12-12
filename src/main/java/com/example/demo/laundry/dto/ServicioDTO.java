package com.example.demo.laundry.dto;

import java.util.Date;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ServicioDTO {
	
	private Integer id;
	
	private String numeroguia;
	
	private Date fecharecepcion;
	
	private Date fechaentrega;
	
	private String descripcion;
	
	private String observaciones;
	
	private float precio;
	
	private float acuenta;
	
	private String cancelado;
	
	private Integer usuario;
	
	private Integer tipoServicio;
	
	private Integer cliente;
	
	private String createdBy;
	
	private String updatedBy;

	public ServicioDTO(Integer id, String numeroguia, Date fecharecepcion, Date fechaentrega, String descripcion,
			String observaciones, float precio, float acuenta, String cancelado, Integer usuario, Integer tipoServicio,
			Integer cliente, String createdBy, String updatedBy) {
		this.id = id;
		this.numeroguia = numeroguia;
		this.fecharecepcion = fecharecepcion;
		this.fechaentrega = fechaentrega;
		this.descripcion = descripcion;
		this.observaciones = observaciones;
		this.precio = precio;
		this.acuenta = acuenta;
		this.cancelado = cancelado;
		this.usuario = usuario;
		this.tipoServicio = tipoServicio;
		this.cliente = cliente;
		this.createdBy = createdBy;
		this.updatedBy = updatedBy;
	}

	
	
	

}
