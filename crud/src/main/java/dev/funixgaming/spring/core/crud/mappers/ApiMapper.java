package dev.funixgaming.spring.core.crud.mappers;

import dev.funixgaming.spring.core.crud.dtos.ApiDTO;
import dev.funixgaming.spring.core.crud.entities.ApiEntity;
import org.mapstruct.*;

/**
 * @param <ENTITY> entity db
 * @param <DTO> dto api
 */
@MapperConfig
public interface ApiMapper<ENTITY extends ApiEntity, DTO extends ApiDTO> {
    @Mapping(target = "uuid", source = "id")
    @Mapping(target = "id", ignore = true)
    ENTITY toEntity(DTO dto);

    @Mapping(target = "id", source = "uuid")
    DTO toDto(ENTITY entity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void patch(ENTITY request, @MappingTarget ENTITY toPatch);
}
