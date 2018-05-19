package com.mercadolibre.qm.tdd.model;

import java.io.Serializable;

public class Distance implements Serializable {

    private Long meters;

    public Distance(Long meters) {
        this.meters = meters;
    }

    public Long distanceInMeters() {
        return meters;
    }

    public Double distanceInKilometers() {
        return meters / 1000D;
    }

}
