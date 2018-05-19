package com.mercadolibre.qm.tdd.server;

import java.util.Objects;

public class Path {

    private String path;

    public Path(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Path)) return false;
        Path path1 = (Path) o;
        return Objects.equals(getPath(), path1.getPath());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPath());
    }
}
