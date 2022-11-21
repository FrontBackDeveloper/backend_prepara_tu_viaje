
package com.back_prep_viajes.prepara.tu.viaje.controller;

import com.back_prep_viajes.prepara.tu.viaje.model.Gasto;
import com.back_prep_viajes.prepara.tu.viaje.model.Presupuesto;
import com.back_prep_viajes.prepara.tu.viaje.service.service.impl.GastoService;
import com.back_prep_viajes.prepara.tu.viaje.service.service.impl.PresupuestoService;
import java.util.ArrayList;
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
    @Autowired
    public PresupuestoService presupuestoService;
    
    @GetMapping("/gastos/listar")
    @ResponseBody
    public List<Gasto> obtenerGasto() {
     
       return service.obtenerGasto();
        }
       
    @PostMapping("presupuesto/{id}/gastos/crear")
    @ResponseBody
    public void crearGasto(@PathVariable Long id,@RequestBody Gasto gasto) {
       
        Presupuesto presu = presupuestoService.obtenerPresupuesto(id); 
        ArrayList <Gasto> listaGastos = new ArrayList();  
        Gasto nuevoGasto = new Gasto();
    //AGREGO EL OBJETO PRESUPUESTO EN LOS ATRIBUTOS DEL OBJETO GASTO
        nuevoGasto.setId(gasto.getId());
        nuevoGasto.setNombre(gasto.getNombre());
        nuevoGasto.setMoneda(gasto.getMoneda());
        nuevoGasto.setTotal(gasto.getTotal());
        nuevoGasto.setPresupuesto(presu);
        
        listaGastos.add(nuevoGasto);
     //GUARDO EL GASTO CON EL OBJETO PRESUPUESTO   
        service.crearGasto(nuevoGasto);      
        
        presu.setListaGastos(listaGastos);
     //EDITO EL OBJETO PRESUPUESTO Y GUARDO EN BD
        presupuestoService.modificarPresupuesto(presu);
        
        for (Gasto gastos : listaGastos){
            System.out.println("Lista de gastos: "+" id: " + gastos.getId()+" nombre gasto: " + gastos.getNombre()+" total: "+gastos.getTotal()
            +" pertenece al presupuesto: " + gastos.getPresupuesto().getNombre());
        }

        
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
