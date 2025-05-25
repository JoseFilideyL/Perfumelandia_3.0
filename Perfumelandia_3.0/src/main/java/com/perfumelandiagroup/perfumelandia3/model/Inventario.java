package com.perfumelandiagroup.perfumelandia3.model;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Inventario {
    private int idPerfume;
    private String nombrePerfume;
    private String marcaPerfume;
    private String tipoPerfume;
}

