package com.project.MenuTracker.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class GoogleMapService {
    @Value("${map.api.key}")
    private String apiKey;
    @Value("${map.ids}")
    private String mapIds;

    public String getGoogleMapUrl() {
        return String.format(
                "https://maps.googleapis.com/maps/api/js?key=%s&map_ids=%s&loading=async&callback=initMap",
                apiKey, mapIds
        );
    }
}
