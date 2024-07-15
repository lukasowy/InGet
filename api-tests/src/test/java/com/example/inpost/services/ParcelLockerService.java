package com.example.inpost.services;

import com.example.inpost.config.ApiConfig;
import com.example.inpost.connectors.InPostApiConnector;
import com.example.inpost.model.Item;
import com.example.inpost.model.Points;
import io.restassured.response.Response;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ParcelLockerService {

    private final InPostApiConnector inPostApiConnector;
    private final ApiConfig apiConfig;

    public List<Item> fetchAllLockers(String city, String type) {
        List<Item> allLockers = new ArrayList<>();
        int page = 1;
        int totalPages;

        do {
            Response response = inPostApiConnector.fetchPoints(city, type, apiConfig.getPerPage(), page);
            if (response.getStatusCode() == 200) {
                Points points = response.as(Points.class);
                allLockers.addAll(points.getItems());
                totalPages = points.getTotalPages();
                page++;
            } else {
                throw new RuntimeException("Failed to fetch data: " + response.getStatusLine());
            }
        } while (page <= totalPages);

        return allLockers;
    }
}
