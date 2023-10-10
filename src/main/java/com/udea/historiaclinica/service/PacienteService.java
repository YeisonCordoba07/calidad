package com.udea.historiaclinica.service;

import com.udea.historiaclinica.model.Paciente;
import com.udea.historiaclinica.repository.IPacienteRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class PacienteService {

    private IPacienteRepository iPacienteRepository;

    public PacienteService(IPacienteRepository iPacienteRepository) {
        this.iPacienteRepository = iPacienteRepository;
    }


    public Paciente findPacienteByCedula(String cedula){
        return iPacienteRepository.findPacienteByCedula(cedula);
    }


}
