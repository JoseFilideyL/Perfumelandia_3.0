package com.perfumelandiagroup.perfumelandia3.service;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import  java.util.List;
import com.perfumelandiagroup.perfumelandia3.repository.TiendaRepository;
import com.perfumelandiagroup.perfumelandia3.model.TiendaModel;

@Service
public class TiendaService {
    @Autowired
    private TiendaRepository tiendaRepository;

    public List<TiendaModel> obtenerTienda(){return tiendaRepository.obtenerTienda();}

    public TiendaModel obtenerTiendaPorId(String id){return tiendaRepository.obtenerTiendaPorId(id);}

    public boolean actualizarTienda(TiendaModel tienda){return tiendaRepository.actualizarTienda(tienda);}

    public boolean eliminarTienda(String id){return tiendaRepository.eliminarTiendaporId(id);}
}
