package com.project.MenuTracker.api.controller;

import com.project.MenuTracker.controller.MapController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@AutoConfigureMockMvc
public class MapControllerTest {
    @Autowired
    private MapController mapController;
    // apiKey and mapIds must be provided before running the test.
    @Test
    public void mapController_getGoogleMap(){
        String apiKey = "";
        String mapIds = "";
        String apiUrl = String.format(
            "https://maps.googleapis.com/maps/api/js?key=%s&map_ids=%s&loading=async&callback=initMap",
            apiKey, mapIds
        );
        ResponseEntity<String> mockResponseEntity = ResponseEntity.ok(apiUrl);
        assertEquals(mockResponseEntity, mapController.getGoogleMap());
    }
}
