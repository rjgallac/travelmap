package com.example.demo.model;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class MarkerDto {

    private Long id;

    private String longitude;

    private String latitude;

    private String description;


}
