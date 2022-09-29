package org.inaes.av.model;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity(name = "Acuerdo")
@Data
public class Acuerdo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7905678814295133067L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	long idConvocatoria;
	String titulo;
	String descripcion;
	int numerodeVecesaVotar;
	LocalDateTime fechaInicioDeliberacion;
	LocalDateTime fechaFinDeliberacion;
	LocalDateTime fechaLimitedeVotacion;
	int rondadeVotacionVigente;
	TiposdeAcuerdo tipo;
	
	

}
