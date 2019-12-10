package com.ron;

import spark.Request;
import spark.Response;
import spark.Route;

import static spark.Spark.*;

public class HelloWorldServer {

    public static void main(String[] args) {

        // get("/hello", (req, res) -> "Hello World");

        get(new Route("/hello") {
            @Override
            public Object handle(Request request, Response response) {
                return "Hello World";
            }
        });
    }
}
