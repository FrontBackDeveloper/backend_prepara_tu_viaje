
package com.back_prep_viajes.prepara.tu.viaje.controller;

import com.back_prep_viajes.prepara.tu.viaje.model.Comentario;
import com.back_prep_viajes.prepara.tu.viaje.model.Respuesta;
import com.back_prep_viajes.prepara.tu.viaje.service.service.impl.ComentarioService;
import com.back_prep_viajes.prepara.tu.viaje.service.service.impl.RespuestaService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RespuestaController {
    
    @Autowired 
    public RespuestaService service;
    @Autowired 
    public ComentarioService comentarioService;
    
    @GetMapping("/respuestas/listar")
    @ResponseBody
    public List <Respuesta> obtenerRespuesta() {
        return service.obtenerRespuesta();
    }
    
    @PostMapping("comentario/{id}/respuesta/crear")
    @ResponseBody
    public  void crearRespuesta(@PathVariable Long id,@RequestBody Respuesta respuesta) {
           
        Comentario comen = comentarioService.obtenerComentario(id); 
        ArrayList <Respuesta> listaRespuestas = new ArrayList();  
        Respuesta nuevaRespuesta = new Respuesta();
        
    //AGREGO EL OBJETO COMENTARIO EN LOS ATRIBUTOS DEL OBJETO RESPUESTA
        nuevaRespuesta.setId(respuesta.getId());
        nuevaRespuesta.setNombre_usuario(respuesta.getNombre_usuario());
        nuevaRespuesta.setRespuesta(respuesta.getRespuesta());
        nuevaRespuesta.setFecha_publicado(respuesta.getFecha_publicado());
        nuevaRespuesta.setComentario(comen);
    
        listaRespuestas.add(nuevaRespuesta);
     //GUARDO LA RESPUESTA CON EL OBJETO COMENTARIO   
        service.crearRespuesta(nuevaRespuesta);      
        
        comen.setListaRespuesta(listaRespuestas);
  
    }
    
    @DeleteMapping("/respuesta/eliminar/{id}")
    public  void borrarRespuesta(@PathVariable Long id) {
       service.borrarRespuesta(id);
    }
  
}
