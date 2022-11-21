
package com.back_prep_viajes.prepara.tu.viaje.model;

import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name="comentarios")

public class Comentario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
     
    @Basic
    private String nombre_usuario;
    private String foto_perfil;
    private String comentario;
    private String fecha_publicado;
    
    @OneToMany (mappedBy="comentario", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    
    private List<Respuesta> listaRespuesta;
  
    
   
    public Comentario() {
    }

    public Comentario(String nombre_usuario, String foto_perfil, String comentario, String fecha_publicado, List<Respuesta> listaRespuesta) {
        this.nombre_usuario = nombre_usuario;
        this.foto_perfil = foto_perfil;
        this.comentario = comentario;
        this.fecha_publicado = fecha_publicado;
        this.listaRespuesta = listaRespuesta;
    }

   

  
    
    
}
