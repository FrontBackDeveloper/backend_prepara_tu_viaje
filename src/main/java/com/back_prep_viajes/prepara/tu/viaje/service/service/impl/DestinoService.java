
package com.back_prep_viajes.prepara.tu.viaje.service.service.impl;

import com.back_prep_viajes.prepara.tu.viaje.model.Destino;
import com.back_prep_viajes.prepara.tu.viaje.repository.DestinoRepository;
import com.back_prep_viajes.prepara.tu.viaje.service.IDestinoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DestinoService implements IDestinoService{

    @Autowired
    public DestinoRepository repository;
            
    @Override
    public List<Destino> obtenerDestino() {
        return repository.findAll();
          }

    @Override
    public void crearDestino(Destino destino) {
        repository.save(destino);
        }

    @Override
    public void borrarDestino(Long id_detino) {
        repository.deleteById(id_detino);
         }

    @Override
    public Destino obtenerDestino(Long id_destino) {
        return repository.findById(id_destino).orElse(null);
        }

    @Override
    public void modificarDestino(Destino destino) {
        repository.save(destino);
        }
    
}
