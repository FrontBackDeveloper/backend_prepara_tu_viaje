
package com.back_prep_viajes.prepara.tu.viaje.repository;

import com.back_prep_viajes.prepara.tu.viaje.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
    
}
