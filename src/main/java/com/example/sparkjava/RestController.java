package com.example.sparkjava;

import static spark.Spark.*;


/**
 * Created by robertwood on 4/27/16.
 */
public class RestController {

    public RestController() {
        port(8031);

        get("/", (req, res) -> "Spark Java 01");
    }
}
