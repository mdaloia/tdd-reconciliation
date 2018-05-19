package com.mercadolibre.qm.tdd;

import com.mercadolibre.qm.tdd.client.RestClient;
import com.mercadolibre.qm.tdd.config.AppRouter;
import com.mercadolibre.qm.tdd.server.Json;
import com.mercadolibre.qm.tdd.server.Response;
import com.mercadolibre.qm.tdd.server.Server;

public class Main {

    public static void main(String[] args) {
        Server server = new Server();

        new AppRouter().init(server);

        RestClient restClient = new RestClient(server);

        Response response = restClient.get("/");
        Json json = response.getContent();

        System.out.println("Status: " + response.getStatus());
        System.out.println("Distance: " + json.get("distance"));
    }

}
