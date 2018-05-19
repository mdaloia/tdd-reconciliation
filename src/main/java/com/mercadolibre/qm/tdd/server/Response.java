package com.mercadolibre.qm.tdd.server;

public class Response {

    private Status status;
    private Json content;

    public void setResponse(Status status, Json content) {
        this.status = status;
        this.content = content;
    }

    public Status getStatus() {
        return status;
    }

    public Json getContent() {
        return content;
    }

}
