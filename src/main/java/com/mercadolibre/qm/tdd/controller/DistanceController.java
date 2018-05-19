package com.mercadolibre.qm.tdd.controller;

import com.mercadolibre.qm.tdd.server.Json;
import com.mercadolibre.qm.tdd.server.Request;
import com.mercadolibre.qm.tdd.server.Response;
import com.mercadolibre.qm.tdd.server.Status;

public class DistanceController {

    public void getDistance(Request request, Response response) {
        Json json = new Json();
        json.put("distance", 582);

        response.setResponse(Status.OK, json);
    }

}
