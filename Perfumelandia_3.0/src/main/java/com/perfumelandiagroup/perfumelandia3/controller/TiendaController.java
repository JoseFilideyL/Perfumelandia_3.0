package com.perfumelandiagroup.perfumelandia3.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.perfumelandiagroup.perfumelandia3.service.TiendaService;
import com.perfumelandiagroup.perfumelandia3.model.TiendaModel;

import java.util.List;



@RestController
@RequestMapping("/tienda")
public class TiendaController {
    @Autowired
    private TiendaService tiendaService;

    @GetMapping
    public List<TiendaModel> obtenerTienda(){return tiendaService.obtenerTienda();}

    @GetMapping("/{id}")
    public TiendaModel obtenerTiendaPorId(@PathVariable String id){return tiendaService.obtenerTiendaPorId(id);}

    @PutMapping
    public boolean actualizarTienda(@RequestBody TiendaModel tienda){return tiendaService.actualizarTienda(tienda);}

    @DeleteMapping("/{id}")
    public boolean eliminarTienda(@PathVariable String id){return tiendaService.eliminarTienda(id);}
}
