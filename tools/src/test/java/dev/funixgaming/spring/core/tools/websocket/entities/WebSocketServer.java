package dev.funixgaming.spring.core.tools.websocket.entities;

import dev.funixgaming.spring.core.tools.websocket.services.ApiWebsocketServerHandler;
import lombok.Getter;
import lombok.NonNull;
import org.springframework.web.socket.WebSocketSession;

@Getter
public class WebSocketServer extends ApiWebsocketServerHandler {

    private String lastMessage;

    @Override
    public void newWebsocketMessage(@NonNull WebSocketSession session, @NonNull String message) throws Exception {
        this.lastMessage = message;
    }
}
