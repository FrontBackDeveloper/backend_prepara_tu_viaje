
package com.back_prep_viajes.prepara.tu.viaje.repository;

import com.back_prep_viajes.prepara.tu.viaje.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogRepository extends JpaRepository<Blog, Long>{
    
}
