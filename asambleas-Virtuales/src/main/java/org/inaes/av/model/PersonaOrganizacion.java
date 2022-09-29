package org.inaes.av.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity(name = "PersonaOrganizacion")
@Data
public class PersonaOrganizacion implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7770223614005152831L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long id;
	long idPersona;
	long idOrganizacion;
	String rol;

	
	
	

}
