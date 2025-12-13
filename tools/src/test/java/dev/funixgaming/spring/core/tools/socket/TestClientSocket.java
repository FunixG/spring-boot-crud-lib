package dev.funixgaming.spring.core.tools.socket;

import dev.funixgaming.spring.core.exceptions.ApiException;

import java.net.Socket;
import java.util.concurrent.atomic.AtomicBoolean;

public class TestClientSocket extends ApiClientSocket {
    private final AtomicBoolean passed;
    private final String toCheck;

    public TestClientSocket(String socketAddress, int port, final AtomicBoolean atomicBoolean, final String toCheck) throws ApiException {
        super(socketAddress, port);
        this.passed = atomicBoolean;
        this.toCheck = toCheck;
    }

    public TestClientSocket(Socket socket, final AtomicBoolean atomicBoolean, final String toCheck) throws ApiException {
        super(socket);
        this.passed = atomicBoolean;
        this.toCheck = toCheck;
    }

    @Override
    public void receiveData(String data) {
        if (data.equals(toCheck)) {
            passed.set(true);
        }
    }
}
