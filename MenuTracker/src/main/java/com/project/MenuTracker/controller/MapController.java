package com.project.MenuTracker.controller;

import com.project.MenuTracker.service.GoogleMapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/map")
public class MapController {

    @Autowired
    GoogleMapService mapService;

    @GetMapping("/get-google-map-url")
    public ResponseEntity<String> getGoogleMap(){
        return ResponseEntity.ok(mapService.getGoogleMapUrl());
    }
}
