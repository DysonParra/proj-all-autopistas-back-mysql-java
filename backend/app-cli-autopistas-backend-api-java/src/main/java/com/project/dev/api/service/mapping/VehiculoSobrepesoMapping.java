/*
 * @fileoverview    {VehiculoSobrepesoMapping}
 *
 * @version         2.0
 *
 * @author          Dyson Arley Parra Tilano <dysontilano@gmail.com>
 *
 * @copyright       Dyson Parra
 * @see             github.com/DysonParra
 *
 * History
 * @version 1.0     Implementation done.
 * @version 2.0     Documentation added.
 */
package com.project.dev.api.service.mapping;

import com.project.dev.api.domain.VehiculoSobrepeso;
import com.project.dev.api.dto.VehiculoSobrepesoDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * TODO: Description of {@code VehiculoSobrepesoMapping}.
 *
 * @author Dyson Parra
 * @since Java 17 (LTS), Gradle 7.3
 */
@Mapper(componentModel = "spring") //, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface VehiculoSobrepesoMapping extends GenericMapping<VehiculoSobrepesoDTO, VehiculoSobrepeso> {

    /**
     * Obtiene una entidad en base a su DTO usando el campo clave de la base de datos.
     *
     * @param dto es el DTO a convertir en entidad.
     * @return la entidad equivalente al dto.
     */
    @Mapping(source = "intIdRepeso", target = "intIdRepeso")
    @Override
    public VehiculoSobrepeso getEntity(VehiculoSobrepesoDTO dto);

    /**
     * Obtiene un DTO en base a su entidad usando el campo clave de la base de datos.
     *
     * @param entity es la entidad a convertir en DTO.
     * @return el dto equivalente a la entidad.
     */
    @Mapping(source = "intIdRepeso", target = "intIdRepeso")
    @Override
    public VehiculoSobrepesoDTO getDto(VehiculoSobrepeso entity);

    /**
     * TODO: Description of method {@code withId}.
     *
     * @param strId
     * @return
     */
    public default VehiculoSobrepeso withId(String strId) {
        if (strId == null) {
            return null;
        }
        VehiculoSobrepeso entity = new VehiculoSobrepeso();
        entity.setIntIdRepeso(Long.parseLong(strId));
        return entity;
    }
}
