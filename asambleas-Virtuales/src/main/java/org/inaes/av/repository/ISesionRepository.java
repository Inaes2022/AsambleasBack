package org.inaes.av.repository;

import org.inaes.av.model.Sesion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "*")
@RepositoryRestResource(collectionResourceRel = "sesion", path = "sesiones")
public interface ISesionRepository  extends JpaRepository<Sesion, Long> {
	
}
