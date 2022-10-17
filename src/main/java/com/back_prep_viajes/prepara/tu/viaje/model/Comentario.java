
package com.back_prep_viajes.prepara.tu.viaje.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity

public class Comentario {
    
        @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_comentario;
     
     @Basic
    private Long id_usuario;
    private String nombre_usuario;
    private String foto_perfil;
    private String comentario;
  
    public Comentario() {
    }

    public Comentario(Long id_usuario, String nombre_usuario, String foto_perfil, String comentario) {
        this.id_usuario     = id_usuario;
        this.nombre_usuario = nombre_usuario;
        this.foto_perfil    = foto_perfil;
        this.comentario     = comentario;
    }
    

    
}
