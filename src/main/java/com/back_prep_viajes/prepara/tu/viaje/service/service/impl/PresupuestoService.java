
package com.back_prep_viajes.prepara.tu.viaje.service.service.impl;

import com.back_prep_viajes.prepara.tu.viaje.model.Presupuesto;
import com.back_prep_viajes.prepara.tu.viaje.repository.PresupuestoRepository;
import com.back_prep_viajes.prepara.tu.viaje.service.IPresupuestoService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PresupuestoService implements IPresupuestoService{
    
    @Autowired
    public PresupuestoRepository repository;
    
    @Override
    public List<Presupuesto> obtenerPresupuesto() {  
                return repository.findAll();
    }

    @Override
    public void crearPresupuesto(Presupuesto presupuesto) {
        repository.save(presupuesto);
        }

    @Override
    public void borrarPresupuesto(Long id) {
        repository.deleteById(id);
        }

    @Override
    public Presupuesto obtenerPresupuesto(Long id) {
        return repository.findById(id).orElse(null);
        }

    @Override
    public void modificarPresupuesto(Presupuesto presupuesto) {
        repository.save(presupuesto);
         }
}
