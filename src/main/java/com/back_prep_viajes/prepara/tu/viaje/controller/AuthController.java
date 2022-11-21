
package com.back_prep_viajes.prepara.tu.viaje.controller;

import com.back_prep_viajes.prepara.tu.viaje.model.Usuario;
import com.back_prep_viajes.prepara.tu.viaje.model.dto.UserDto;
import com.back_prep_viajes.prepara.tu.viaje.service.service.impl.AuthService;
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
public class AuthController {
    
    @Autowired
    AuthService authService;
    @Autowired
    UsuarioService usuarioService;
    
    @PostMapping("/login")
    public boolean login(@RequestBody UserDto userDto) {
        return authService.isUserEnabled(userDto);
    } 
    
    @PostMapping("/registro")
    public void register(@RequestBody Usuario usuario) throws Exception {
         authService.crearUsuario(usuario);
    }
    
    @GetMapping("/usuarios/listar")
    @ResponseBody
    private List <Usuario> obtenerUsuarios() {
        return authService.obtenerUsuarios();
    }
     
}
