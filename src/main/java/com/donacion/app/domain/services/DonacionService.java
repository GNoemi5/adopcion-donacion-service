package com.donacion.app.domain.services;

import com.donacion.app.domain.entities.Donacion;

import java.util.List;

public interface DonacionService {

    List<Donacion> listarDonacionesPorPersona(Integer idPersona);

    void registrarDonacion(Donacion donacion);
}
