package org.inaes.av.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity(name = "ConvocadosConvocatoria")
@Data
public class ConvocadosConvocatoria implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5439290860138144436L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	private int idConvocatoria;
	private String idPersona;

}
