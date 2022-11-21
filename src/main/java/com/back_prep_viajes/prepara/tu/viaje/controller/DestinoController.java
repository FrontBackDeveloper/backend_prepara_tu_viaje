
package com.back_prep_viajes.prepara.tu.viaje.controller;

import com.back_prep_viajes.prepara.tu.viaje.model.Destino;
import com.back_prep_viajes.prepara.tu.viaje.model.Usuario;
import com.back_prep_viajes.prepara.tu.viaje.service.service.impl.DestinoService;
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
public class DestinoController {
    
    @Autowired 
    public DestinoService service;
    @Autowired
    public UsuarioService userService;
    
    @GetMapping("/destino/listar")
    @ResponseBody
    public List<Destino> obtenerDestino() {
        return service.obtenerDestino();
    }
    
    @PostMapping("usuario/{id}/destino/crear")
    @ResponseBody
    public void crearDestino(@PathVariable Long id,@RequestBody Destino destino) {
        
        Usuario user = userService.obtenerUsuario(id); 
        ArrayList <Destino> listaDestinos = new ArrayList();  
        Destino nuevoDestino = new Destino();
        
    //AGREGO EL OBJETO USUARIO EN LOS ATRIBUTOS DEL OBJETO DESTINO
        nuevoDestino.setId(destino.getId());
        nuevoDestino.setNombre(destino.getNombre());
        nuevoDestino.setFecha_partida(destino.getFecha_partida());
        nuevoDestino.setHora_partida(destino.getHora_partida());
        nuevoDestino.setUsuario(user);
    
        listaDestinos.add(nuevoDestino);
     //GUARDO EL DESTINO CON EL OBJETO USUARIO   
        service.crearDestino(nuevoDestino);      
        
        user.setListadestinos(listaDestinos);
  
        for (Destino des : listaDestinos){
            System.out.println("NOMBRE DESTINO: "+ des.getNombre());
            System.out.println("FECHA DE SALIDA: "+ des.getFecha_partida());
            System.out.println("HORA DE SALIDA:"+ des.getHora_partida());
            System.out.println("USUARIO:"+ des.getUsuario().getNombre_usuario());
            
        }
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
