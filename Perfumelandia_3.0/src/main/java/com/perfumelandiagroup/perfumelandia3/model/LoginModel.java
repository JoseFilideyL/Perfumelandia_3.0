package com.perfumelandiagroup.perfumelandia3.model;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class LoginModel {

    private String rut;
    private String primerNombre;
    private String primerApellido;
    private String segundoApellido;
    private int telefono;
    private String direccion;
    private String correo;
}
