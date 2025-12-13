package dev.funixgaming.spring.core.storage.doc.repositories;

import dev.funixgaming.spring.core.crud.repositories.ApiRepository;
import dev.funixgaming.spring.core.storage.doc.entities.TestStorageFile;
import org.springframework.stereotype.Repository;

@Repository
public interface TestStorageRepository extends ApiRepository<TestStorageFile> {
}
