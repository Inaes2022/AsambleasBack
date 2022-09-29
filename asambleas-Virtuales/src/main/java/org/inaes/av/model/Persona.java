package org.inaes.av.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity(name = "Persona")
@Data
public class Persona implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long id;
	String nombre;
	String apellidoMaterno;
	String apellidoPaterno;
	String correoElectronico;
	String curp;
	String telefono;
	String whatsapp;
	String nacionalidad;
	String sexo;
	String fechaNacimiento;
	Tipo tipo;
	boolean mesaDirectiva;
	Status status;
	boolean voz;
	boolean voto;
	String password;
	String idUsuario;
	boolean bloqueado;
}
