package com.mercadolibre.qm.tdd.server;

import java.util.HashMap;
import java.util.Map;

public class Server {

    private Map<RequestLine, Route> handlers = new HashMap<>();

    public void get(String path, Route handler) {
        registerHandler(Method.GET, new Path(path), handler);
    }

    public void post(String path, Route handler) {
        registerHandler(Method.POST, new Path(path), handler);
    }

    public void put(String path, Route handler) {
        registerHandler(Method.PUT, new Path(path), handler);
    }

    public void delete(String path, Route handler) {
        registerHandler(Method.DELETE, new Path(path), handler);
    }

    public Response handleRequest(Method method, String path) {
        Path pathBO = new Path(path);

        RequestLine requestLine = new RequestLine(method, pathBO);
        Route handler = handlers.get(requestLine);

        Request request = new Request(method, pathBO);
        Response response = new Response();

        handler.handle(request, response);

        return response;
    }

    private void registerHandler(Method method, Path path, Route handler) {
        RequestLine requestLine = new RequestLine(method, path);

        handlers.put(requestLine, handler);
    }

}
