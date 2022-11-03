
package com.back_prep_viajes.prepara.tu.viaje.service.service.impl;

import com.back_prep_viajes.prepara.tu.viaje.model.Noticia;
import com.back_prep_viajes.prepara.tu.viaje.repository.NoticiaRepository;
import com.back_prep_viajes.prepara.tu.viaje.service.INoticiaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoticiaService implements INoticiaService{

    @Autowired
    public NoticiaRepository repository;
    
    @Override
    public List<Noticia> obtenerNoticia() {
        return repository.findAll();
         }

    @Override
    public void crearNoticia(Noticia noticia) {
        repository.save(noticia);
          }

    @Override
    public void borrarNoticia(Long id) {
        repository.deleteById(id);
        }

    @Override
    public Noticia obtenerNoticia(Long id) {
        return repository.findById(id).orElse(null);
         }

    @Override
    public void modificarNoticia(Noticia noticia) {
        repository.save(noticia);
        }
    
}
