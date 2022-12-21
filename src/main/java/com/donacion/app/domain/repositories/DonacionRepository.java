package com.donacion.app.domain.repositories;

import com.donacion.app.domain.entities.Donacion;

import java.util.List;

public interface DonacionRepository {

    List<Donacion> obtenerDonacionesPorPersona(Integer idPersona);

    void registrarDonacion(Donacion donacion);
}
