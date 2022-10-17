
package com.back_prep_viajes.prepara.tu.viaje.service;

import com.back_prep_viajes.prepara.tu.viaje.model.Comentario;
import java.util.List;


public interface IComentarioService {
    public List<Comentario> obtenerComentario();
    public void crearComentario(Comentario comentario);
    public void borrarComentario(Long id_comentario);
    public Comentario obtenerComentario(Long id_comentario);
    public void modificarComentario(Comentario comentario);
}
