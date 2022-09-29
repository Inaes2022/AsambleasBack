package org.inaes.av.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity(name = "OpciondeVotacion")
@Data
public class OpciondeVotacion implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1919584540543464776L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long id;
	long idAcuerdo;
	long idConvocatoria;
	String titulo;
}
