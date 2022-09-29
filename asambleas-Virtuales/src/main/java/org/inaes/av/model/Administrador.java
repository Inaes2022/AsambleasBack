package org.inaes.av.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity(name = "Administrador")
@Data
public class Administrador implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5849563614259953070L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long id;
	long idPersona;
	
}
