package org.inaes.av.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity(name = "Mensaje")
@Data
public class Mensaje implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1431499626976183905L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long id;
	long idPersona;
	TipoMensaje tipo;
	Date fecha;
	String message;
	String head;
	long session;


}
