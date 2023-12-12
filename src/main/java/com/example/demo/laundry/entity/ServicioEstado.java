package com.example.demo.laundry.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "estadoservicio")
public class ServicioEstado extends BaseEntity{
	
	@Column(name = "servicio")
	private Integer servicio;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "estado")
	Estado estado;


}
