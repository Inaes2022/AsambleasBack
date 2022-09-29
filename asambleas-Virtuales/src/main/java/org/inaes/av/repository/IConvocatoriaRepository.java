package org.inaes.av.repository;

import java.util.List;

import org.inaes.av.model.Convocatoria;
import org.inaes.av.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "*")
@RepositoryRestResource(collectionResourceRel = "convocatoria", path = "convocatorias")
public interface IConvocatoriaRepository extends JpaRepository<Convocatoria, Long> {
	List<Convocatoria> findByVigente(@Param("vigente") boolean vigente);

}
