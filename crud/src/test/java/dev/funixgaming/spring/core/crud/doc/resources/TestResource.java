package dev.funixgaming.spring.core.crud.doc.resources;

import dev.funixgaming.spring.core.crud.doc.clients.TestClient;
import dev.funixgaming.spring.core.crud.doc.dtos.TestDTO;
import dev.funixgaming.spring.core.crud.doc.services.TestService;
import dev.funixgaming.spring.core.crud.resources.ApiResource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestResource extends ApiResource<TestDTO, TestService> implements TestClient {
    public TestResource(TestService service) {
        super(service);
    }
}
