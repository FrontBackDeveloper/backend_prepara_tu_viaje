
package com.back_prep_viajes.prepara.tu.viaje.controller;

import com.back_prep_viajes.prepara.tu.viaje.model.Gasto;
import com.back_prep_viajes.prepara.tu.viaje.service.service.impl.GastoService;
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
public class GastoController {
    
    @Autowired 
    public GastoService service;
    
    @GetMapping("/gastos/listar")
    @ResponseBody
    public List<Gasto> obtenerGasto() {
        return service.obtenerGasto();
    }
    
    @PostMapping("/gastos/crear")
    @ResponseBody
    public void crearGasto(@RequestBody Gasto gasto) {
        service.crearGasto(gasto);
    }
    
     @DeleteMapping("/gastos/eliminar/{id}")
    public void borrarGasto(@PathVariable Long id) {
        service.borrarGasto(id);
    }
    
     @GetMapping("/gastos/buscar/{id}")
    @ResponseBody
    public Gasto obtenerGasto(@PathVariable Long id) {
        return service.obtenerGasto(id);
    }
    
     @PutMapping("/gastos/actualizar")
    public void modificarGasto(@RequestBody Gasto gasto) {
        service.modificarGasto(gasto);
    }
}
