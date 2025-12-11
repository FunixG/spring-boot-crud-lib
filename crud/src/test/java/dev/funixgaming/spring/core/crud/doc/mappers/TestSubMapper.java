package dev.funixgaming.spring.core.crud.doc.mappers;

import dev.funixgaming.spring.core.crud.doc.dtos.TestSubDTO;
import dev.funixgaming.spring.core.crud.doc.entities.TestSubEntity;
import dev.funixgaming.spring.core.crud.mappers.ApiMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = TestMapper.class)
public interface TestSubMapper extends ApiMapper<TestSubEntity, TestSubDTO> {
}
