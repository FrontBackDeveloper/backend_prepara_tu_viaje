
package com.back_prep_viajes.prepara.tu.viaje.service.service.impl;

import com.back_prep_viajes.prepara.tu.viaje.model.Comentario;
import com.back_prep_viajes.prepara.tu.viaje.repository.ComentarioRepository;
import com.back_prep_viajes.prepara.tu.viaje.service.IComentarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ComentarioService implements IComentarioService{
    @Autowired
    public ComentarioRepository repository;
            
    @Override
    public List<Comentario> obtenerComentario() {
        return repository.findAll();
         }

    @Override
    public void crearComentario(Comentario comentario) {
        repository.save(comentario);
         }

    @Override
    public void borrarComentario(Long id) {
        repository.deleteById(id);
          }

    @Override
    public Comentario obtenerComentario(Long id) {
        return repository.findById(id).orElse(null);
      }

    @Override
    public void modificarComentario(Comentario comentario) {
        repository.save(comentario);
       }
    
}
