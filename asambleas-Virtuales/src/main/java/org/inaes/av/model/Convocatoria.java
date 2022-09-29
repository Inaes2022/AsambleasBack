package org.inaes.av.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;


@Entity(name = "Convocatoria")
@Data
public class Convocatoria implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2392572439495829052L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int idOrganizacion;
	private String nombre;
	private Date inicioAsamblea;
	private Date finAsamblea;
	private TiposdeAsamblea tipo;
	private int anio;
	private int numero;
	private boolean vigente;
}
