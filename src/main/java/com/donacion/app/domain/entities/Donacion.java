package com.donacion.app.domain.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name="donacion")
@Getter
@Setter
public class Donacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name="idDonacion")
    private Integer id;

    @Column(name="monto")
    private BigDecimal monto;

    @Column(name="birthDate")
    private Date fechaDonacion;

    @ManyToOne(fetch = FetchType.EAGER)
    private Persona persona;

}
