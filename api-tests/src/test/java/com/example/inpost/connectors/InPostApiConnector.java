package com.example.inpost.connectors;

import com.example.inpost.config.ApiConfig;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class InPostApiConnector {

    private final ApiConfig apiConfig;

    private RequestSpecification prepareInPostApiRequest() {
        return RestAssured.given()
                .baseUri(apiConfig.getBaseUri())
                .contentType("application/json");
    }

    public Response fetchPoints(String city, String type, int perPage, int page) {
        if (city == null || city.isEmpty() || type == null || type.isEmpty() || perPage <= 0 || page < 0) {
            throw new IllegalArgumentException("Invalid input parameters");
        }

        return prepareInPostApiRequest()
                .when()
                .queryParam("city", city)
                .queryParam("type", type)
                .queryParam("per_page", perPage)
                .queryParam("page", page)
                .get("/points")
                .then()
                .log().ifValidationFails()
                .extract().response();
    }
}
