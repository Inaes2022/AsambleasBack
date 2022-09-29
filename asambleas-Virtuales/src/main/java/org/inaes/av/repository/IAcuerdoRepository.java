package org.inaes.av.repository;

import java.util.List;

import org.inaes.av.model.Acuerdo;
import org.inaes.av.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "*")
@RepositoryRestResource(collectionResourceRel = "acuerdo", path = "acuerdos")
public interface IAcuerdoRepository extends JpaRepository<Acuerdo, Long> {
	List<Acuerdo> findByIdConvocatoria(@Param("idConvocatoria") long idConvocatoria);
	
}
