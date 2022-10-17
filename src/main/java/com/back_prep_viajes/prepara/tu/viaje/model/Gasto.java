
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

public class Gasto {
      @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_gasto;
      
      @Basic
    private Long   id_usuario;
    private String nombre;
    private String moneda;
    private Long   total;
    
    public Gasto() {
    }

    public Gasto(Long id_usuario, String nombre, String moneda, Long total) {
       
        this.id_usuario = id_usuario;
        this.nombre     = nombre;
        this.moneda     = moneda;
        this.total      = total;
    }
    
}
