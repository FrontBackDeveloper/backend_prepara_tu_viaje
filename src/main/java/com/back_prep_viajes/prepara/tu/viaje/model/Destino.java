
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

public class Destino {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_destino;
     
     @Basic
    private Long id_usuario;
    private String destino;
    private String fecha_partida;
    
   public Destino() {
    }

    public Destino(Long id_usuario, String destino, String fecha_partida) {
        this.id_usuario = id_usuario;
        this.destino       = destino;
        this.fecha_partida = fecha_partida;
    }

    
}
