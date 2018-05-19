package com.mercadolibre.qm.tdd.client;

import com.mercadolibre.qm.tdd.server.Method;
import com.mercadolibre.qm.tdd.server.Response;
import com.mercadolibre.qm.tdd.server.Server;

public class RestClient {

    private final Server server;

    public RestClient(Server server) {
        this.server = server;
    }

    public Response get(String path) {
        return server.handleRequest(Method.GET, path);
    }

    public Response post(String path) {
        return server.handleRequest(Method.POST, path);
    }

    public Response put(String path) {
        return server.handleRequest(Method.PUT, path);
    }

    public Response delete(String path) {
        return server.handleRequest(Method.DELETE, path);
    }

}
