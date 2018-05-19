package com.mercadolibre.qm.tdd.server;

import java.util.Objects;

public class RequestLine {

    private Method method;
    private Path path;

    public RequestLine(Method method, Path path) {
        this.method = method;
        this.path = path;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RequestLine)) return false;
        RequestLine that = (RequestLine) o;
        return method == that.method &&
                Objects.equals(path, that.path);
    }

    @Override
    public int hashCode() {
        return Objects.hash(method, path);
    }
}
