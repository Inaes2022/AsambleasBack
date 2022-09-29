package org.inaes.av.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity(name = "Sesion")
@Data
public class Sesion implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2582259819162362266L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long id;
	long idPersona;
	long idOrganizacion;
	Date fechaInicio;
	Date fechaFin;
	boolean activa;

}
