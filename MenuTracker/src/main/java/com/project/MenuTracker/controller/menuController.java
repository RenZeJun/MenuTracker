package com.project.MenuTracker.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
//@RequestMapping("")
public class menuController {
    public ResponseEntity<String> getMenu(){

        String response = "test string";
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
