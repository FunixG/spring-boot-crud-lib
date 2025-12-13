package dev.funixgaming.spring.core.test.beans;

import com.google.gson.Gson;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import tools.jackson.core.type.TypeReference;
import tools.jackson.databind.ObjectMapper;

import java.lang.reflect.Type;

@Component
@RequiredArgsConstructor
public class JsonHelper {

    private final ObjectMapper objectMapper;

    public <T> String toJson(T object) {
        return objectMapper.writeValueAsString(object);
    }

    public <T> T fromJson(String payload, Class<T> clazz) {
        return objectMapper.readValue(payload, clazz);
    }

    public <T> T fromJson(String payload, TypeReference<T> clazz) {
        return objectMapper.readValue(payload, clazz);
    }

    public <T> T fromJson(String payload, Type type) {
        final Gson gson = new Gson();

        return gson.fromJson(payload, type);
    }

}
