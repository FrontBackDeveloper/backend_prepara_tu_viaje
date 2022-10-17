
package com.back_prep_viajes.prepara.tu.viaje.controller;

import com.back_prep_viajes.prepara.tu.viaje.model.Destino;
import com.back_prep_viajes.prepara.tu.viaje.service.service.impl.DestinoService;
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
public class DestinoController {
    
    @Autowired 
    public DestinoService service;
    
    @GetMapping("/destino/listar")
    @ResponseBody
    public List<Destino> obtenerDestino() {
        return service.obtenerDestino();
    }
    
    @PostMapping("/destino/crear")
    @ResponseBody
    public void crearDestino(@RequestBody Destino destino) {
        service.crearDestino(destino);
    }
    
     @DeleteMapping("/destino/eliminar/{id}")
    public void borrarDestino(@PathVariable Long id) {
        service.borrarDestino(id);
    }
    
     @GetMapping("/destino/buscar/{id}")
    @ResponseBody
    public Destino obtenerDestino(@PathVariable Long id) {
        return service.obtenerDestino(id);
    }
    
     @PutMapping("/destino/actualizar")
    public void modificarDestino(@RequestBody Destino destino) {
        service.modificarDestino(destino);
    }
}
