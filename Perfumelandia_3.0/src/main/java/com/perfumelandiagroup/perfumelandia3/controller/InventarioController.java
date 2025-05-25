package com.perfumelandiagroup.perfumelandia3.controller;

import com.perfumelandiagroup.perfumelandia3.model.Inventario;
import com.perfumelandiagroup.perfumelandia3.service.InventarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/inventario")
public class InventarioController {

    @Autowired
    public InventarioService inventarioService;

    @GetMapping
    public List<Inventario> listaInventarios() {return inventarioService.getInventario();}
    @PostMapping
    public Inventario agregarInventario(@RequestBody Inventario inventario) {
        return inventarioService.guardarInventario(inventario);
    }

    @GetMapping("{id}")
    public Inventario buscarInventario(@PathVariable int idPerfume) {
        return inventarioService.getInventarioPorId(idPerfume);
    }

    @PutMapping
    public Inventario updateInventario(@PathVariable int idPerfume, @RequestBody Inventario inventario){
        return inventarioService.updateInventario(inventario);
    }
}
