package com.perfumelandiagroup.perfumelandia3.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
@Entity
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
