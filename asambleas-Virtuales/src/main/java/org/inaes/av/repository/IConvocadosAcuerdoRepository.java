package org.inaes.av.repository;

import java.util.List;

import org.inaes.av.model.ConvocadosAcuerdo;
import org.inaes.av.model.OpciondeVotacion;
import org.inaes.av.model.PersonaOrganizacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "*")
@RepositoryRestResource(collectionResourceRel = "convocadoAcuerdo", path = "convocadosAcuerdo")
public interface IConvocadosAcuerdoRepository extends JpaRepository<ConvocadosAcuerdo, Long> {
	List<ConvocadosAcuerdo> findByIdConvocatoria(@Param("idConvocatoria") long idConvocatoria);

}
