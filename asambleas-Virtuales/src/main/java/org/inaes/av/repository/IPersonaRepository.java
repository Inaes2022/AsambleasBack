package org.inaes.av.repository;

import java.util.List;

import org.inaes.av.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;


@CrossOrigin(origins = "*")
@RepositoryRestResource(collectionResourceRel = "persona", path = "personas")
public interface IPersonaRepository  extends JpaRepository<Persona, Long> {
	List<Persona> findByApellidoPaterno(@Param("apellidoPaterno") String apellidoPaterno);
	List<Persona> findByIdUsuario(@Param("idUsuario") String idUsuario);
	List<Persona> findByCorreoElectronico(@Param("correoElectronico") String correoElectronico);
	
}
