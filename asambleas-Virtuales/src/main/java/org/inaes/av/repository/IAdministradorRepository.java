package org.inaes.av.repository;

import org.inaes.av.model.Administrador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "*")
@RepositoryRestResource(collectionResourceRel = "administrador", path = "administradores")
public interface IAdministradorRepository  extends JpaRepository<Administrador, Long> {

}
