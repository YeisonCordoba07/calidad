package com.udea.historiaclinica.service;

import com.udea.historiaclinica.model.HistoriaPaciente;
import com.udea.historiaclinica.repository.IHistoriaPaciente;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional
public class HistoriaPacienteService {

    private IHistoriaPaciente iHistoriaPaciente;

    public HistoriaPacienteService(IHistoriaPaciente iHistoriaPaciente) {

        this.iHistoriaPaciente = iHistoriaPaciente;
    }

    public void guardarHistoriaPaciente(HistoriaPaciente historiaPaciente){
        iHistoriaPaciente.save(historiaPaciente);
    }

    public List<HistoriaPaciente> findAllHistoriaPaciente(String cedula){
        return iHistoriaPaciente.findAllHistoriaPacienteByCedulaPaciente(cedula);
    }
}
