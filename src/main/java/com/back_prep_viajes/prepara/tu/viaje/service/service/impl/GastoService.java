
package com.back_prep_viajes.prepara.tu.viaje.service.service.impl;

import com.back_prep_viajes.prepara.tu.viaje.model.Gasto;
import com.back_prep_viajes.prepara.tu.viaje.repository.GastoRepository;
import com.back_prep_viajes.prepara.tu.viaje.service.IGastoService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GastoService implements IGastoService{

    @Autowired
    public GastoRepository repository;
            
    @Override
    public List<Gasto> obtenerGasto() {
      return repository.findAll();
         }
   

    @Override
    public void crearGasto(Gasto gasto) {
        repository.save(gasto);
        }

    @Override
    public void borrarGasto(Long id) {
        repository.deleteById(id);
        }

    @Override
    public Gasto obtenerGasto(Long id) {
        return repository.findById(id).orElse(null);
        }

    @Override
    public void modificarGasto(Gasto gasto) {
        repository.save(gasto);
        }
    
}
