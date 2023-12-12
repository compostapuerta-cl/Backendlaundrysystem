package com.example.demo.laundry.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Entity
@DynamicInsert
@DynamicUpdate
@NoArgsConstructor
@Table(name = "servicio")
public class Servicio extends BaseEntity{
	
	@Column(name = "numeroguia")
	private String numeroguia;
	
	@Column(name = "fecharecepcion")
	private Date fecharecepcion;
	
	@Column(name = "fechaentrega")
	private Date fechaentrega;
	
	@Column(name = "descripcion")
	private String descripcion;
	
	@Column(name = "observaciones")
	private String observaciones;
	
	@Column(name = "precio")
	private float precio;
	
	@Column(name = "acuenta")
	private float acuenta;
	
	@Column(name = "cancelado")
	private String cancelado;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "usuario")
	Usuario usuario;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "tiposervicio")
	TipoServicio tipoServicio;	
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "cliente")
	Cliente cliente;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="servicio")
	List<ServicioEstado> listServicioEstado;
	
}
	
