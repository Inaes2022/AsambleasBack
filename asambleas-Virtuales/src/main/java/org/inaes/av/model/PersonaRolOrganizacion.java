package org.inaes.av.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity(name = "PersonaRolOrganizacion")
@Data
public class PersonaRolOrganizacion implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3700684935901973443L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)long id;
	long idPersona;
	long idOrganización;
}
