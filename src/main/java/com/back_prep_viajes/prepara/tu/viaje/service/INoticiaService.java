
package com.back_prep_viajes.prepara.tu.viaje.service;

import com.back_prep_viajes.prepara.tu.viaje.model.Noticia;
import java.util.List;


public interface INoticiaService {
    public List<Noticia> obtenerNoticia();
    public void crearNoticia(Noticia noticia);
    public void borrarNoticia(Long id);
    public Noticia obtenerNoticia(Long id);
    public void modificarNoticia(Noticia noticia);
    
}
