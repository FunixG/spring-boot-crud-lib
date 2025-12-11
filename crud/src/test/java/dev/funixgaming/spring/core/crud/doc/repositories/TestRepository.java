package dev.funixgaming.spring.core.crud.doc.repositories;

import dev.funixgaming.spring.core.crud.doc.entities.TestEntity;
import dev.funixgaming.spring.core.crud.repositories.ApiRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRepository extends ApiRepository<TestEntity> {
}
