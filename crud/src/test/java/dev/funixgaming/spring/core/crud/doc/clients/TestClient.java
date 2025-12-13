package dev.funixgaming.spring.core.crud.doc.clients;

import dev.funixgaming.spring.core.crud.clients.CrudClient;
import dev.funixgaming.spring.core.crud.doc.dtos.TestDTO;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("test")
public interface TestClient extends CrudClient<TestDTO> {
}
