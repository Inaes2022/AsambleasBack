package org.inaes.av.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity(name = "Organizacion")
@Data
public class Organizacion implements Serializable{
	
	private static final long serialVersionUID = 4774878920272787754L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long id;
	String nombre;
	String Descripcion;
	

}
