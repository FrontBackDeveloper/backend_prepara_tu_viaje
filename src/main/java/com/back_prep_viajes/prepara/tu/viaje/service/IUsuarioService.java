
package com.back_prep_viajes.prepara.tu.viaje.service;

import com.back_prep_viajes.prepara.tu.viaje.model.Usuario;
import java.util.List;


public interface IUsuarioService {
    public void borrarUsuario(Long id);
    public Usuario obtenerUsuario(Long id);
    public void modificarUsuario(Usuario usuario);
}
