package com.mercadolibre.qm.tdd.model;

import com.mercadolibre.qm.tdd.model.Distance;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DistanceTest {

    @Test
    public void return_the_distance_in_kilometers() {
        Distance distance = new Distance(1234L);

        Double kilometers = distance.distanceInKilometers();

        Assertions.assertEquals(1.234, kilometers, 0.000001);
    }

}
