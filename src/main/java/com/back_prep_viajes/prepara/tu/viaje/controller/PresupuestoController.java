
package com.back_prep_viajes.prepara.tu.viaje.controller;


import com.back_prep_viajes.prepara.tu.viaje.model.Presupuesto;
import com.back_prep_viajes.prepara.tu.viaje.service.service.impl.PresupuestoService;
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
public class PresupuestoController {
    
    @Autowired 
    public PresupuestoService service;
    
    @GetMapping("/presupuesto/listar")
    @ResponseBody
    public List <Presupuesto> obtenerPresupuesto() {
        return service.obtenerPresupuesto();
    }
    
    @PostMapping("/presupuesto/crear")
    @ResponseBody
    public  void crearPresupuesto(@RequestBody Presupuesto presupuesto) {
        service.crearPresupuesto(presupuesto);
    }
    
    @DeleteMapping("/presupuesto/eliminar/{id}")
    public  void borrarPresupuesto(@PathVariable Long id) {
       service.borrarPresupuesto(id);
    }
 
    
     @GetMapping("/presupuesto/buscar/{id}")
    @ResponseBody
    public Presupuesto obtenerPresupuesto(@PathVariable Long id) {
        return service.obtenerPresupuesto(id);
    }
   
     @PutMapping("/presupuesto/actualizar")
    public void modificarPresupuesto(@RequestBody Presupuesto presupuesto) {
        service.modificarPresupuesto(presupuesto);
    }
}
