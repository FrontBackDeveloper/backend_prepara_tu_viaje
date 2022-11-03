
package com.back_prep_viajes.prepara.tu.viaje.service.service.impl;

import com.back_prep_viajes.prepara.tu.viaje.model.Usuario;
import com.back_prep_viajes.prepara.tu.viaje.repository.UsuarioRepository;
import com.back_prep_viajes.prepara.tu.viaje.service.IUsuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService implements IUsuarioService{
    
      @Autowired
    public UsuarioRepository repository;

    @Override
    public List<Usuario> obtenerUsuario() {
      return repository.findAll();
    }

    @Override
    public void crearUsuario(Usuario usuario) {
      repository.save(usuario);
    }

    @Override
    public void borrarUsuario(Long id) {
       repository.deleteById(id);
    }

    @Override
    public Usuario obtenerUsuario(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void modificarUsuario(Usuario usuario) {
       repository.save(usuario);
    }
    
}
