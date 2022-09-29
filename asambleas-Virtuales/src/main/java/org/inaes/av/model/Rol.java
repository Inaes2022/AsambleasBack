package org.inaes.av.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity(name = "Rol")
@Data
public class Rol implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3941155838247557098L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long id;
	String nombre;
	String descripcion; 

}
