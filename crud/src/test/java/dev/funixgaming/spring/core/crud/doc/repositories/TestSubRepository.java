package dev.funixgaming.spring.core.crud.doc.repositories;

import dev.funixgaming.spring.core.crud.doc.entities.TestSubEntity;
import dev.funixgaming.spring.core.crud.repositories.ApiRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestSubRepository extends ApiRepository<TestSubEntity> {
}
