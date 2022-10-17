
package com.back_prep_viajes.prepara.tu.viaje.model;

import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
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
@Table(name="presupuestos")

public class Presupuesto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_presupuesto;
     
    @Basic
    private String nombre;
    private long total;
    
    @OneToMany
    @JoinColumn(name="id_presupuesto")
    private List<Gasto> listagastos;
    
    public Presupuesto() {
    }

    public Presupuesto(String nombre, long total, List<Gasto> listagastos) {
      
        this.nombre = nombre;
        this.total = total;
        this.listagastos = listagastos;
    }

}
