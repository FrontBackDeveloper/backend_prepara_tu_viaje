
package com.back_prep_viajes.prepara.tu.viaje.controller;

import com.back_prep_viajes.prepara.tu.viaje.model.Usuario;
import com.back_prep_viajes.prepara.tu.viaje.service.service.impl.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {
    
    @Autowired
    public UsuarioService userService;
    
     @DeleteMapping("/usuario/eliminar/{id}")
    public  void borrarUsuario(@PathVariable Long id) {
       userService.borrarUsuario(id);
    }
 
    
     @GetMapping("/usuario/buscar/{id}")
    @ResponseBody
    public Usuario obtenerUsuario(@PathVariable Long id) {
        return userService.obtenerUsuario(id);
    }
   
     @PutMapping("/usuario/actualizar")
    public void modificarUsuario(@RequestBody Usuario usuario) {
        userService.modificarUsuario(usuario);
    }
    
}
