package com.donacion.app.domain.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="persona")
@Getter
@Setter
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name="idPersona")
    private Integer id;

    @Column (name="name")
    private String nombre;

    @Column (name="lastName")
    private String apellido;

}
