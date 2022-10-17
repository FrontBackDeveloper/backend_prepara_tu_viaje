/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.back_prep_viajes.prepara.tu.viaje.controller;

import com.back_prep_viajes.prepara.tu.viaje.model.Noticia;
import com.back_prep_viajes.prepara.tu.viaje.service.service.impl.NoticiaService;
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
public class NoticiaController {
    
    @Autowired 
    public NoticiaService service;
    
    @GetMapping("/noticias/listar")
    @ResponseBody
    public List<Noticia> obtenerNoticia() {
        return service.obtenerNoticia();
    }
    
    @PostMapping("/noticias/crear")
    @ResponseBody
    public void crearNoticia(@RequestBody Noticia noticia) {
        service.crearNoticia(noticia);
    }
    
     @DeleteMapping("/noticias/eliminar/{id}")
    public void borrarNoticia(@PathVariable Long id) {
        service.borrarNoticia(id);
    }
    
     @GetMapping("/noticias/buscar/{id}")
    @ResponseBody
    public Noticia obtenerNoticia(@PathVariable Long id) {
        return service.obtenerNoticia(id);
    }
    
     @PutMapping("/noticias/actualizar")
    public void modificarNoticia(@RequestBody Noticia noticia) {
        service.modificarNoticia(noticia);
    }
    
}
