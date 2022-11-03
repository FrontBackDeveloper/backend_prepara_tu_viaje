
package com.back_prep_viajes.prepara.tu.viaje.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name="noticias")

public class Noticia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
     
     @Basic
    private String origen;
    private String titulo;
    private String descripcion;
    private String url;
    private String imagen;
    private String fecha_publicado;
    
    public Noticia() {
    }

    public Noticia(String origen, String titulo, String descripcion, String url, String imagen, String fecha_publicado) {
        this.origen = origen;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.url = url;
        this.imagen = imagen;
        this.fecha_publicado = fecha_publicado;
    }

 
         
    }
  
