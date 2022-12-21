package com.donacion.app.domain.services;

import com.donacion.app.domain.entities.Donacion;
import com.donacion.app.domain.repositories.DonacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class DonacionServiceImpl implements DonacionService{

    @Autowired
    private DonacionRepository donacionRepository;

    @Override
    public List<Donacion> listarDonacionesPorPersona(Integer idPersona) {
        return donacionRepository.obtenerDonacionesPorPersona(idPersona);
    }

    @Override
    public void registrarDonacion(Donacion donacion) {
        donacion.setFechaDonacion(new Date());
        donacionRepository.registrarDonacion(donacion);
    }
}
