package dev.funixgaming.spring.core.crud.doc.mappers;

import dev.funixgaming.spring.core.crud.doc.dtos.TestDTO;
import dev.funixgaming.spring.core.crud.doc.entities.TestEntity;
import dev.funixgaming.spring.core.crud.mappers.ApiMapper;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface TestMapper extends ApiMapper<TestEntity, TestDTO> {
    @Override
    @Mapping(target = "uuid", source = "id")
    @Mapping(target = "id", ignore = true)
    TestEntity toEntity(TestDTO dto);

    @Override
    @Mapping(target = "id", source = "uuid")
    TestDTO toDto(TestEntity entity);

    @Override
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void patch(TestEntity request, @MappingTarget TestEntity toPatch);
}
