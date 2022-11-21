
package com.back_prep_viajes.prepara.tu.viaje.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name="respuestas")
public class Respuesta {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Basic
    private String nombre_usuario;
    private String respuesta;
    private String fecha_publicado;
    
    @ManyToOne
    @JoinColumn(name="id_comentario")
    @JsonIgnore
    private Comentario comentario;

    public Respuesta() {
    }

    public Respuesta(String nombre_usuario, String respuesta, String fecha_publicado) {
        this.nombre_usuario = nombre_usuario;
        this.respuesta = respuesta;
        this.fecha_publicado = fecha_publicado;
    }
    
    
}
