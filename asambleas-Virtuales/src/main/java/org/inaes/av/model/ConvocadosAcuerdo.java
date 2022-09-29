package org.inaes.av.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity(name = "ConvocadosAcuerdo")
@Data
public class ConvocadosAcuerdo implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5439290860138144436L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private long idConvocatoria;
	private long idAcuerdo;
	private String idPersona;
	private boolean excluido;
	private RazonesdeNoVoto razondeExclusion;

}
