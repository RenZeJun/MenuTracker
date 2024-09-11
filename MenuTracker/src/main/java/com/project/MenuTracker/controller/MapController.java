package com.project.MenuTracker.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/map")
public class MapController {
    @Value("${map.api.key}")
    private String apiKey;
    @Value("${map.ids}")
    private String mapIds;

    @GetMapping("/get-google-map-url")
    public ResponseEntity<String> getGoogleMap(){
        String googleMapsApiUrl = String.format(
                "https://maps.googleapis.com/maps/api/js?key=%s&map_ids=%s&loading=async&callback=initMap",
                apiKey, mapIds
        );
        return ResponseEntity.ok(googleMapsApiUrl);
    }
}
