package com.perfumelandiagroup.perfumelandia3.model;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class TiendaModel {
    private long id;
    private String nombre;
    private String direccion;
    private int telefono;
    private String email;

}
