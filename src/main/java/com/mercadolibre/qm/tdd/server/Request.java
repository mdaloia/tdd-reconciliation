package com.mercadolibre.qm.tdd.server;

public class Request {

    private Method method;
    private Path path;

    public Request(Method method, Path path) {
        this.method = method;
        this.path = path;
    }

}
