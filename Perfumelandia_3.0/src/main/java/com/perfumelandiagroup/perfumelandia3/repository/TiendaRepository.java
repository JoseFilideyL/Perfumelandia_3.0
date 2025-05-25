package com.perfumelandiagroup.perfumelandia3.repository;
import com.perfumelandiagroup.perfumelandia3.model.TiendaModel;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.ArrayList;

@Repository
public class TiendaRepository {
    private List<TiendaModel> inventariotienda = new ArrayList<>();

    public TiendaRepository (){ inventariotienda.add(new TiendaModel("2313","Perfumelandia","Calle 123",123456789,"Perfumelandia@gmail.cl"));}

 public  TiendaRepository (List<TiendaModel> inventariotienda) {
        this.inventariotienda = inventariotienda;
    }

    public List<TiendaModel> obtenerTienda() {return inventariotienda;}

    public TiendaModel obtenerTiendaPorId(String id) {
        for (TiendaModel tienda : inventariotienda) {
            if (tienda.getId().equals(id)){
                return tienda;
            }
        }
        return null;
    }

    public  Boolean eliminarTiendaporId(String id){
        for (int i = 0; i < inventariotienda.size(); i++) {
            if (inventariotienda.get(i).getId().equals(id)){
                inventariotienda.remove(i);
                return true;
            }
        }
        return false;
    }
    public boolean actualizarTienda(TiendaModel tienda){
        for (int i = 0; i < inventariotienda.size(); i++) {
            if (inventariotienda.get(i).getId().equals(tienda.getId())){
                inventariotienda.set(i,tienda);
                return true;
            }
        }
        return false;
    }
}
