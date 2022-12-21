package com.donacion.app.application.controllers.donacion;

import com.donacion.app.domain.entities.Donacion;
import com.donacion.app.domain.services.DonacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/donacion/v1")
public class DonacionControllerImpl implements DonacionController{

    @Autowired
    private DonacionService donacionService;

    @Override
    public List<Donacion> listarDonacionesPorPersona(Integer idPersona) {
        return donacionService.listarDonacionesPorPersona(idPersona);
    }

    @Override
    public void registrarDonacion(Donacion donacion) {
        donacionService.registrarDonacion(donacion);
    }
}
