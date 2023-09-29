package com.example.demo.model;

import org.springframework.stereotype.Component;

@Component
public class TransformProperty {

    public Marker toProperty(MarkerDto markerDto) {
        return Marker.builder()
                .description(markerDto.getDescription())
                .build();
    }

    public MarkerDto toDto(Marker marker) {
        return MarkerDto.builder()
                .id(marker.getId())
                .description(marker.getDescription())
                .build();
    }

    public MarkerDto toPropertyDetailDto(Marker marker) {
        return MarkerDto.builder()
                .id(marker.getId())
                .description(marker.getDescription())
                .build();
    }

}
