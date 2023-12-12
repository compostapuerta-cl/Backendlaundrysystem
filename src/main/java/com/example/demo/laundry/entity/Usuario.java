package com.example.demo.laundry.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "usuario")
public class Usuario extends BaseEntity{
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "apellido")
	private String apellido;

}
