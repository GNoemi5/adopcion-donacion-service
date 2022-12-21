package com.donacion.app.application.controllers.donacion;

import com.donacion.app.domain.entities.Donacion;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface DonacionController {

    @GetMapping("listar/{idPersona}")
    List<Donacion> listarDonacionesPorPersona(@PathVariable("idPersona") Integer idPersona);

    @PostMapping("registrar")
    void registrarDonacion(@RequestBody Donacion donacion);

}
