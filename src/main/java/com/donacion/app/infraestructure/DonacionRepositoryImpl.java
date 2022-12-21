package com.donacion.app.infraestructure;

import com.donacion.app.domain.entities.Donacion;
import com.donacion.app.domain.repositories.DonacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DonacionRepositoryImpl implements DonacionRepository {

    @Autowired private DonacionJpaRepository donacionJpaRepository;

    @Override
    public List<Donacion> obtenerDonacionesPorPersona(Integer idPersona) {
        List<Donacion> donaciones = donacionJpaRepository.findByPersonaId(idPersona);
        return donaciones;
    }

    @Override
    public void registrarDonacion(Donacion donacion) {
        donacionJpaRepository.save(donacion);
    }
}
