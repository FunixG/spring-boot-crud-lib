package dev.funixgaming.spring.core.crud.doc.services;

import dev.funixgaming.spring.core.crud.doc.dtos.TestDTO;
import dev.funixgaming.spring.core.crud.doc.entities.TestEntity;
import dev.funixgaming.spring.core.crud.doc.mappers.TestMapper;
import dev.funixgaming.spring.core.crud.doc.repositories.TestRepository;
import dev.funixgaming.spring.core.crud.services.ApiService;
import org.springframework.stereotype.Service;

@Service
public class TestService extends ApiService<TestDTO, TestEntity, TestMapper, TestRepository> {

    public TestService(TestRepository repository,
                       TestMapper mapper) {
        super(repository, mapper);
    }

}
