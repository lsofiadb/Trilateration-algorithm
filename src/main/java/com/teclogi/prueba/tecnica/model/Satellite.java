package com.teclogi.prueba.tecnica.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Satellite {
    private String name;
    private double distance;
    private Position position;
}
