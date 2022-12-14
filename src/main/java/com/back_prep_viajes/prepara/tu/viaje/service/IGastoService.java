
package com.back_prep_viajes.prepara.tu.viaje.service;

import com.back_prep_viajes.prepara.tu.viaje.model.Gasto;
import java.util.List;


public interface IGastoService {
    public List<Gasto> obtenerGasto();
    public void crearGasto(Gasto gasto);
    public void borrarGasto (Long id);
    public Gasto obtenerGasto(Long id);
    public void modificarGasto(Gasto gasto);
}
