package dev.funixgaming.spring.core.storage.doc.services;

import dev.funixgaming.spring.core.storage.doc.dtos.TestStorageFileDTO;
import dev.funixgaming.spring.core.storage.doc.entities.TestStorageFile;
import dev.funixgaming.spring.core.storage.doc.mappers.TestStorageMapper;
import dev.funixgaming.spring.core.storage.doc.repositories.TestStorageRepository;
import dev.funixgaming.spring.core.storage.services.ApiStorageService;
import org.springframework.stereotype.Service;

@Service
public class TestStorageService extends ApiStorageService<TestStorageFileDTO, TestStorageFile, TestStorageMapper, TestStorageRepository> {

    public TestStorageService(TestStorageMapper mapper, TestStorageRepository repository) {
        super("test-storage-service", null, repository, mapper);
    }

}
