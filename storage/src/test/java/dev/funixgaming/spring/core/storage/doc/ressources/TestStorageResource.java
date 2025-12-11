package dev.funixgaming.spring.core.storage.doc.ressources;

import dev.funixgaming.spring.core.storage.doc.dtos.TestStorageFileDTO;
import dev.funixgaming.spring.core.storage.doc.services.TestStorageService;
import dev.funixgaming.spring.core.storage.ressources.ApiStorageResource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("testfile")
public class TestStorageResource extends ApiStorageResource<TestStorageFileDTO, TestStorageService> {

    public TestStorageResource(TestStorageService service) {
        super(service);
    }

}
