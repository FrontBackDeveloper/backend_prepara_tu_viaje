
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
    public void borrarComentario(Long id_comentario) {
        repository.deleteById(id_comentario);
          }

    @Override
    public Comentario obtenerComentario(Long id_comentario) {
        return repository.findById(id_comentario).orElse(null);
      }

    @Override
    public void modificarComentario(Comentario comentario) {
        repository.save(comentario);
       }
    
}
