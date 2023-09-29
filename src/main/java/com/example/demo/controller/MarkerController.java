package com.example.demo.controller;

import com.example.demo.model.MarkerDto;
import com.example.demo.service.MarkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/property")
public class MarkerController {

    @Autowired
    private MarkerService markerService;

    @GetMapping
    public List<MarkerDto> get(){
        return markerService.getProperties();
    }

    @GetMapping("/{id}")
    public ResponseEntity<MarkerDto> getProperty(@PathVariable Long id) {
        Optional<MarkerDto> property = markerService.getProperty(id);
        if(property.isPresent()) {
            return ResponseEntity.ok(property.get());
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }


    @PostMapping
    public void post(@RequestBody MarkerDto markerDto){
        markerService.addProperty(markerDto);
    }

    @DeleteMapping("/{id}")
    public void deleteProperty(@PathVariable Long id) {
        markerService.deleteProperty(id);


    }

}
