package com.mercadolibre.qm.tdd.server;

@FunctionalInterface
public interface Route {

    void handle(Request request, Response response);

}
