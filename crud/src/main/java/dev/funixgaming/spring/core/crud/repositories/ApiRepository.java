package dev.funixgaming.spring.core.crud.repositories;

import dev.funixgaming.spring.core.crud.entities.ApiEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.Optional;

@NoRepositoryBean
public interface ApiRepository<ENTITY extends ApiEntity> extends JpaRepository<ENTITY, Long>, JpaSpecificationExecutor<ENTITY> {
    Optional<ENTITY> findByUuid(String uuid);
    Iterable<ENTITY> findAllByUuidIn(Iterable<String> uuidList);
}
