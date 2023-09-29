package com.example.demo.service;

import com.example.demo.model.Marker;
import com.example.demo.model.MarkerDto;
import com.example.demo.model.TransformProperty;
import com.example.demo.repository.MarkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MarkerService {

    @Autowired
    private MarkerRepository markerRepository;

    @Autowired
    private TransformProperty transformProperty;

    public List<MarkerDto> getProperties() {
        Iterable<Marker> properties = markerRepository.findAll();
        List<MarkerDto> markerDtos = new ArrayList<>();
        for (Marker marker : properties) {
            markerDtos.add(transformProperty.toDto(marker));
        }
        return markerDtos;
    }

    public void addProperty(MarkerDto markerDto) {
        Marker marker = transformProperty.toProperty(markerDto);
        markerRepository.save(marker);
    }

    public void deleteProperty(Long id) {
        markerRepository.deleteById(id);
    }

    public Optional<MarkerDto> getProperty(Long id) {
        Optional<Marker> byId = markerRepository.findById(id);
        if(byId.isPresent()) {
            return Optional.of(transformProperty.toPropertyDetailDto(byId.get()));
        }

        return Optional.empty();
    }
}
