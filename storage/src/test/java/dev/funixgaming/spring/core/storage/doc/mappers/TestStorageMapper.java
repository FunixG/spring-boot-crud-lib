package dev.funixgaming.spring.core.storage.doc.mappers;


import dev.funixgaming.spring.core.crud.mappers.ApiMapper;
import dev.funixgaming.spring.core.storage.doc.dtos.TestStorageFileDTO;
import dev.funixgaming.spring.core.storage.doc.entities.TestStorageFile;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TestStorageMapper extends ApiMapper<TestStorageFile, TestStorageFileDTO> {
}
