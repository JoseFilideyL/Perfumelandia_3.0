package com.perfumelandiagroup.perfumelandia3.controller;
import com.perfumelandiagroup.perfumelandia3.auteticacion.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.PatchExchange;
import java.util.Map;
import com.perfumelandiagroup.perfumelandia3.service.LoginServices;
import com.perfumelandiagroup.perfumelandia3.model.LoginModel;

import java.util.List;

@RestController
@RequestMapping("/LoginUsuario")

public class LoginController {

    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping("/token")
    public ResponseEntity<?> generarToken(@RequestBody LoginModel login) {
        if ("admin".equals(login.getUsuario()) && "1234".equals(login.getPassword())) {
            String token = jwtUtil.generateToken(login.getUsuario());
            return ResponseEntity.ok(Map.of("token", token));
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Credenciales inválidas");
        }
    }


    @Autowired
    private LoginServices loginServices;

    @GetMapping
    public List<LoginModel> listaLogin() {
        return loginServices.getLogins();
    }

    @PostMapping
    public LoginModel agregarLogin(@RequestBody LoginModel login) {
        return loginServices.saveLogin(login);
    }

    @GetMapping("{rut}")
    public LoginModel buscarLogin(@PathVariable String rut) {
        return loginServices.getRutModel(rut);
    }

    @PutMapping("{rut}")
    public LoginModel actualizarLogin(@PathVariable String rut, @RequestBody LoginModel login) {
        return loginServices.updateLogin(login);
    }

    @GetMapping("/total")
    public int totalLogins(){
        return loginServices.totalLogins();
    }



}
