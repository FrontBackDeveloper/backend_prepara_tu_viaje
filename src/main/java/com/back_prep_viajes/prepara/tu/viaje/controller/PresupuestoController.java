
package com.back_prep_viajes.prepara.tu.viaje.controller;


import com.back_prep_viajes.prepara.tu.viaje.model.Presupuesto;
import com.back_prep_viajes.prepara.tu.viaje.model.Usuario;
import com.back_prep_viajes.prepara.tu.viaje.service.service.impl.PresupuestoService;
import com.back_prep_viajes.prepara.tu.viaje.service.service.impl.UsuarioService;
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
public class PresupuestoController {
    
    @Autowired 
    public PresupuestoService service;
    @Autowired
    public UsuarioService userService;
            
    
    @GetMapping("/presupuesto/listar")
    @ResponseBody
    public List <Presupuesto> obtenerPresupuesto() {
        return service.obtenerPresupuesto();
    }
    
    @PostMapping("usuario/{id}/presupuesto/crear")
    @ResponseBody
    public  void crearPresupuesto(@PathVariable Long id,@RequestBody Presupuesto presupuesto) {
           
        Usuario user = userService.obtenerUsuario(id); 
        ArrayList <Presupuesto> listaPresupuestos = new ArrayList();  
        Presupuesto nuevoPresupuesto = new Presupuesto();
        
    //AGREGO EL OBJETO USUARIO EN LOS ATRIBUTOS DEL OBJETO PRESUPUESTO
        nuevoPresupuesto.setId(presupuesto.getId());
        nuevoPresupuesto.setNombre(presupuesto.getNombre());
        nuevoPresupuesto.setTotal(presupuesto.getTotal());
        nuevoPresupuesto.setUsuario(user);
    
        listaPresupuestos.add(nuevoPresupuesto);
     //GUARDO EL PRESUPUESTO CON EL OBJETO USUARIO   
        service.crearPresupuesto(nuevoPresupuesto);      
        
        user.setListapresupuestos(listaPresupuestos);
  
        for (Presupuesto pres : listaPresupuestos){
            System.out.println("NOMBRE PRESUPUESTO: "+ pres.getNombre());
            System.out.println("TOTAL: "+ pres.getTotal());
            System.out.println("ID USUARIO:"+ pres.getUsuario().getId());
            System.out.println("NOMBRE USUARIO:"+ pres.getUsuario().getNombre_usuario());
            
        }
  
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
