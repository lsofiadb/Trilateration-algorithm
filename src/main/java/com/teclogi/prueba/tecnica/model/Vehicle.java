package com.teclogi.prueba.tecnica.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Vehicle {
    private Location position;
    private boolean isInDanger;
}
