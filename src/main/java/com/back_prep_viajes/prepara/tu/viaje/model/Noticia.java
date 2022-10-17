
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

public class Noticia {
     @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_noticia;
     
     @Basic
    private String origen;
    private String titulo;
    private String descripcion;
    private String url;
    private String imagen;
    private String fecha_publicado;
    
    public Noticia() {
    }

    public Noticia(String origen, String url, String fecha_publicado) {
      
        this.origen          = origen;
        this.url             = url;
        this.fecha_publicado = fecha_publicado;
    }
         
    }
  
