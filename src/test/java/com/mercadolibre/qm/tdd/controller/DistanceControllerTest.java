package com.mercadolibre.qm.tdd.controller;

import com.mercadolibre.qm.tdd.client.RestClient;
import com.mercadolibre.qm.tdd.config.AppRouter;
import com.mercadolibre.qm.tdd.server.Json;
import com.mercadolibre.qm.tdd.server.Response;
import com.mercadolibre.qm.tdd.server.Server;
import com.mercadolibre.qm.tdd.server.Status;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DistanceControllerTest {

    private Server server;

    @BeforeEach
    public void setup() {
        server = new Server();

        new AppRouter().init(server);
    }

    @Test
    public void return_the_distance() {
        RestClient restClient = new RestClient(server);

        Response response = restClient.get("/");
        Json json = response.getContent();

        Assertions.assertEquals(Status.OK, response.getStatus());
        Assertions.assertEquals(582, json.get("distance"));
    }

}
