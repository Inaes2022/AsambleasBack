package org.inaes.av.repository;

import java.util.List;

import org.inaes.av.model.Secretario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "*")
@RepositoryRestResource(collectionResourceRel = "secretario", path = "secretarios")
public interface ISecretarioRepository  extends JpaRepository<Secretario, Long> {
	List<Secretario> findByIdPersona(@Param("idPersona") long idPersona);
	
}
