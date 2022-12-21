package com.donacion.app.infraestructure;

import com.donacion.app.domain.entities.Donacion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DonacionJpaRepository extends JpaRepository<Donacion,Integer> {

    List<Donacion> findByPersonaId(Integer idPersona);

}
