package dev.funixgaming.spring.core.tools.encryption;

import jakarta.persistence.AttributeConverter;

public interface ApiConverter<T> extends AttributeConverter<T, String> {
}
