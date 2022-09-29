package org.inaes.av.repository;
import org.inaes.av.model.Organizacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "*")
@RepositoryRestResource(collectionResourceRel = "organizacion", path = "organizaciones")
public interface IOrganizacionRepository  extends JpaRepository<Organizacion, Long> {

}
