package com.perfumelandiagroup.perfumelandia3.model;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table (name = "tienda")
public class TiendaModel {
    private String id;
    private String nombre;
    private String direccion;
    private int telefono;
    private String email;

}
