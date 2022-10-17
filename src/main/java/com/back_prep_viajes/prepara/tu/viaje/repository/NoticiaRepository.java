
package com.back_prep_viajes.prepara.tu.viaje.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.back_prep_viajes.prepara.tu.viaje.model.Noticia;

@Repository
public interface NoticiaRepository extends JpaRepository<Noticia, Long>{
    
}
