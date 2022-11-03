
package com.back_prep_viajes.prepara.tu.viaje.model;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
@Table(name="destinos")

public class Destino {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
     
    @Basic
    private String nombre;
    private String fecha_partida;
    private String hora_partida;
    
    @ManyToOne
    @JoinColumn(name="id_usuario")
    private Usuario usuario;
    
    
    
   public Destino() {
    }

    public Destino(String nombre, String fecha_partida, String hora_partida, Usuario usuario) {
        this.nombre = nombre;
        this.fecha_partida = fecha_partida;
        this.hora_partida = hora_partida;
        this.usuario = usuario;
    }

    

    

   

    
}
