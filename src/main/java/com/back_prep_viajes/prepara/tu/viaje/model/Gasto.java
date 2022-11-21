
package com.back_prep_viajes.prepara.tu.viaje.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
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
@Table(name="gastos")

public class Gasto implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
      
    @Basic
    private String nombre;
    private String moneda;
    private Long   total;
    
    @ManyToOne
    @JoinColumn(name="id_presupuesto")
    @JsonIgnore
    private Presupuesto presupuesto;
    
    public Gasto() {
    }

    public Gasto(String nombre, String moneda, Long total, Presupuesto presupuesto) {
        this.nombre = nombre;
        this.moneda = moneda;
        this.total = total;
        this.presupuesto = presupuesto;
    }

   
    
}
