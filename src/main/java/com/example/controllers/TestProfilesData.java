package com.example.controllers;

import com.example.config.DBConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestProfilesData {


    @Autowired
    DBConfiguration dbConfiguration;

    @GetMapping("/data")
    public ResponseEntity<DBConfiguration> data() {
        return ResponseEntity.ok(dbConfiguration);
    }
}
