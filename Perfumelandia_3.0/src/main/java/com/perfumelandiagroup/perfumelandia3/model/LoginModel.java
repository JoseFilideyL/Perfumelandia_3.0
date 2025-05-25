package com.perfumelandiagroup.perfumelandia3.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "LoginUsuario")
public class LoginModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String rut;
    private String primerNombre;
    private String primerApellido;
    private String segundoApellido;
    private int telefono;
    private String direccion;
    private String correo;
}
