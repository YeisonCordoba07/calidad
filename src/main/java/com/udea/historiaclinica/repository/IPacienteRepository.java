package com.udea.historiaclinica.repository;

import com.udea.historiaclinica.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPacienteRepository extends JpaRepository<Paciente, Integer> {

    public Paciente findPacienteByCedula(String cedula);
}
