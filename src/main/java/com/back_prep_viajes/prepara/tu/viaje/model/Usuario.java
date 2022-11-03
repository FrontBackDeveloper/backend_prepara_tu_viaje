
package com.back_prep_viajes.prepara.tu.viaje.model;

import java.util.List;
import javax.persistence.CascadeType;
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
@Table (name="usuarios")

public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private String email;
    private String nombre_usuario;
    private String password;
    private boolean isEnabled;
    
    @OneToMany (mappedBy="usuario",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Presupuesto> listapresupuestos;
    
    @OneToMany (mappedBy="usuario",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Destino> listadestinos;

    public Usuario() {
    }

    public Usuario(String email, String nombre_usuario, String password, boolean isEnabled, List<Presupuesto> listapresupuestos, List<Destino> listadestinos) {
        this.email = email;
        this.nombre_usuario = nombre_usuario;
        this.password = password;
        this.isEnabled = isEnabled;
        this.listapresupuestos = listapresupuestos;
        this.listadestinos = listadestinos;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", email=" + email + ", nombre_usuario=" + nombre_usuario + ", password=" + password + ", isEnabled=" + isEnabled + ", listapresupuestos=" + listapresupuestos + ", listadestinos=" + listadestinos + '}';
    }

   
    
    
}
