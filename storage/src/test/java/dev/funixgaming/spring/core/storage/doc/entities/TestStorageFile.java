package dev.funixgaming.spring.core.storage.doc.entities;

import dev.funixgaming.spring.core.storage.entities.ApiStorageFile;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class TestStorageFile extends ApiStorageFile {

    private String data;

}
