package com.udea.historiaclinica.controller;

import com.udea.historiaclinica.DTO.PacienteDTO;
import com.udea.historiaclinica.model.HistoriaPaciente;
import com.udea.historiaclinica.service.HistoriaPacienteService;
import com.udea.historiaclinica.service.PacienteService;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/paciente")
public class PacienteController {

    @Autowired
    private PacienteService pacienteService;
    private HistoriaPacienteService historiaPacienteService;


    public PacienteController(PacienteService pacienteService, HistoriaPacienteService historiaPacienteService) {
        this.pacienteService = pacienteService;
        this.historiaPacienteService = historiaPacienteService;
    }

    @GetMapping("/get-paciente/{cedula}")
    public ResponseEntity<PacienteDTO> findPacienteByCedula(@PathVariable String cedula){
        var paciente = pacienteService.findPacienteByCedula(cedula);
        var historiaPaciente = historiaPacienteService.findAllHistoriaPaciente(cedula);

        PacienteDTO pacienteDTO = new PacienteDTO();
        pacienteDTO.setCedula(paciente.getCedula());
        pacienteDTO.setNombre(paciente.getNombre());
        pacienteDTO.setApellido(paciente.getApellido());
        pacienteDTO.setCorreo(paciente.getCorreo());
        pacienteDTO.setHistoriaClinica(historiaPaciente);
        return ResponseEntity.ok(pacienteDTO);
    }


    @PostMapping("/guardar-historia-paciente")
    public void guardarHistoriaPaciente(@RequestBody HistoriaPaciente historiaPaciente){
       historiaPacienteService.guardarHistoriaPaciente(historiaPaciente);
    }
}
