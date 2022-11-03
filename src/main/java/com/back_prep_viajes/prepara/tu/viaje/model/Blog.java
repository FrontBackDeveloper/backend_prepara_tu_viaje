
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

public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
     
     @Basic
    private String titulo;
    private String texto;
    private String fecha_publicado;
    
    public Blog() {
    }

    public Blog(String titulo, String texto, String fecha_publicado) {
        this.titulo  = titulo;
        this.texto  = texto;
        this.fecha_publicado = fecha_publicado;
    }
    
}
