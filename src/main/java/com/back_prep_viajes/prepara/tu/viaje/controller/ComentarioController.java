
package com.back_prep_viajes.prepara.tu.viaje.controller;

import com.back_prep_viajes.prepara.tu.viaje.model.Comentario;
import com.back_prep_viajes.prepara.tu.viaje.service.service.impl.ComentarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ComentarioController {
    
    @Autowired 
    public ComentarioService service;
    
    @GetMapping("/comentarios/listar")
    @ResponseBody
    public List<Comentario> obtenerComentario() {
        return service.obtenerComentario();
    }
    
    @PostMapping("/comentarios/crear")
    @ResponseBody
    public void crearComentario(@RequestBody Comentario comentario) {
        service.crearComentario(comentario);
    }
    
     @DeleteMapping("/comentarios/eliminar/{id}")
    public void borrarComentario(@PathVariable Long id) {
        service.borrarComentario(id);
    }
    
     @GetMapping("/comentarios/buscar/{id}")
    @ResponseBody
    public Comentario obtenerComentario(@PathVariable Long id) {
        return service.obtenerComentario(id);
    }
    
     @PutMapping("/comentarios/actualizar")
    public void modificarComentario(@RequestBody Comentario comentario) {
        service.modificarComentario(comentario);
    }
}
