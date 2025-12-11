package dev.funixgaming.spring.core.crud.doc.clients;

import dev.funixgaming.spring.core.crud.clients.CrudClient;
import dev.funixgaming.spring.core.crud.doc.dtos.TestSubDTO;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("TestSub")
public interface TestSubClient extends CrudClient<TestSubDTO> {
}
