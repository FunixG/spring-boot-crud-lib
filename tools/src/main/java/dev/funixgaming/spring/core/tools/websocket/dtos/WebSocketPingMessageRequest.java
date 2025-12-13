package dev.funixgaming.spring.core.tools.websocket.dtos;

import dev.funixgaming.spring.core.tools.string.PasswordGenerator;
import lombok.Getter;

import java.time.Instant;

@Getter
public class WebSocketPingMessageRequest {

    private final Instant sentAt = Instant.now();

    private final String verification;

    public WebSocketPingMessageRequest() {
        final PasswordGenerator passwordGenerator = new PasswordGenerator();
        passwordGenerator.setAlphaUpper(5);
        passwordGenerator.setAlphaDown(5);
        passwordGenerator.setNumbersAmount(5);
        passwordGenerator.setSpecialCharsAmount(0);

        this.verification = passwordGenerator.generateRandomPassword();
    }

}
