
package com.back_prep_viajes.prepara.tu.viaje.service.service.impl;

import com.back_prep_viajes.prepara.tu.viaje.model.Respuesta;
import com.back_prep_viajes.prepara.tu.viaje.repository.RespuestaRepository;
import com.back_prep_viajes.prepara.tu.viaje.service.IRespuestaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RespuestaService implements IRespuestaService{
    
    @Autowired
    public RespuestaRepository repository;
     
     @Override
    public List<Respuesta> obtenerRespuesta() {  
                return repository.findAll();
    }

    @Override
    public void crearRespuesta(Respuesta respuesta) {
        repository.save(respuesta);
        }

    @Override
    public void borrarRespuesta(Long id) {
        repository.deleteById(id);
        }
  
    
}
