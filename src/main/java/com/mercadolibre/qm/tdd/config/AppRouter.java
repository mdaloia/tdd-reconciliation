package com.mercadolibre.qm.tdd.config;

import com.mercadolibre.qm.tdd.controller.DistanceController;
import com.mercadolibre.qm.tdd.server.Server;

public class AppRouter {

    public void init(Server server) {
        DistanceController dc = new DistanceController();

        server.get("/", dc::getDistance);
    }

}
