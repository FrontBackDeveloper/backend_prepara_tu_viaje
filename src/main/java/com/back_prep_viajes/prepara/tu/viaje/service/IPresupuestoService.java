
package com.back_prep_viajes.prepara.tu.viaje.service;

import com.back_prep_viajes.prepara.tu.viaje.model.Presupuesto;
import java.util.List;


public interface IPresupuestoService {
    public List<Presupuesto> obtenerPresupuesto();
    public void crearPresupuesto(Presupuesto presupuesto);
    public void borrarPresupuesto(Long id);
    public Presupuesto obtenerPresupuesto(Long id);
    public void modificarPresupuesto(Presupuesto presupuesto);
}
