package com.perfumelandiagroup.perfumelandia3.model;
import jakarta.persistence.*;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table (name = "tienda")
public class TiendaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tienda")
    private String id;
    @Column(name = "nombre_tienda")
    private String nombre;
    @Column(name = "direccion_tienda")
    private String direccion;
    @Column(name = "telefono_tienda")
    private int telefono;
    @Column(name = "email_tienda")
    private String email;

}
