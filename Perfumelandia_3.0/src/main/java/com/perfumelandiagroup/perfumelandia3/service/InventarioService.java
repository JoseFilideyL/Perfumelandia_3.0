package com.perfumelandiagroup.perfumelandia3.service;

import com.perfumelandiagroup.perfumelandia3.model.Inventario;
import com.perfumelandiagroup.perfumelandia3.repository.InventarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventarioService {

    @Autowired
    private final InventarioRepository inventarioRepository;

    public InventarioService(InventarioRepository inventarioRepository) {
        this.inventarioRepository = inventarioRepository;
    }

    public List<Inventario> getInventario() {return inventarioRepository.obtenerInventario();}

    public Inventario guardarInventario(Inventario inventario) {return inventarioRepository.guardar(inventario);}

    public Inventario getInventarioPorId(int id) {return inventarioRepository.buscarPorId(id);}

    public Inventario updateInventario(Inventario inventarioActualizado){
        return inventarioRepository.actualizarInventario(inventarioActualizado);
    }

    public String deleteInventario(int id)  {
        inventarioRepository.eliminar(id);
        return "Eliminado del Inventario";
    }

    public int totalInventario() {return inventarioRepository.totalInventario();}
}