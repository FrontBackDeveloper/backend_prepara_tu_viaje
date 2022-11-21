
package com.back_prep_viajes.prepara.tu.viaje.service;

import com.back_prep_viajes.prepara.tu.viaje.model.Respuesta;
import java.util.List;


public interface IRespuestaService {
    
    public List<Respuesta> obtenerRespuesta();
    public void crearRespuesta(Respuesta respuesta);
    public void borrarRespuesta(Long id);
   
}
