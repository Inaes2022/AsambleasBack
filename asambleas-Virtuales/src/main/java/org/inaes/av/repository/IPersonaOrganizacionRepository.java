package org.inaes.av.repository;

import org.inaes.av.model.PersonaOrganizacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "*")
@RepositoryRestResource(collectionResourceRel = "PersonaOrganizacion", path = "personasOrganizacion")
public interface IPersonaOrganizacionRepository  extends JpaRepository<PersonaOrganizacion, Long> {
	
}
