package org.inaes.av.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity(name = "Opcion")
@Data
public class Opcion implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2153771585594904364L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long id;
	String menu;
	String submenu;
	String titulo;
	String title;
	String tipodeUsuario;
	String view;
	String url;
	boolean vigente;
}
