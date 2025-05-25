package com.perfumelandiagroup.perfumelandia3.repository;

import com.perfumelandiagroup.perfumelandia3.model.Inventario;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class InventarioRepository {
    private List<Inventario> listaInventario = new ArrayList<>();

    public InventarioRepository() {listaInventario.add(new Inventario(1, "Acqua di gio,", "Giorgio Armani", "Parfum"));}

    public List<Inventario> obtenerInventario() {return listaInventario;}

    public Inventario buscarPorId(int id) {
        for (Inventario inventario : listaInventario){
            if (inventario.getIdPerfume() == id){
                return inventario;
            }
        }
        return null;
    }
    public Inventario guardar(Inventario inventario) {
        listaInventario.add(inventario);
        return inventario;
    }

    public Inventario actualizarInventario(Inventario inventarioActualizado) {
        for (int i = 0; i <listaInventario.size(); i++){
            Inventario actual = listaInventario.get(i);
            if (actual.getIdPerfume()== inventarioActualizado.getIdPerfume()){
                listaInventario.set(i, inventarioActualizado);
                return inventarioActualizado;
            }
        }
        return null;
    }

    public void eliminar(int id) {
        Inventario inventario = buscarPorId(id);
        if (inventario != null){
            listaInventario.remove(inventario);
        }
    }

    public int totalInventario() {
        return listaInventario.size();
    }

}
