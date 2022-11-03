
package com.back_prep_viajes.prepara.tu.viaje.service;

import com.back_prep_viajes.prepara.tu.viaje.model.Destino;
import java.util.List;


public interface IDestinoService {
    public List<Destino> obtenerDestino();
    public void crearDestino(Destino destino);
    public void borrarDestino(Long id);
    public Destino obtenerDestino(Long id);
    public void modificarDestino(Destino destino);
}
