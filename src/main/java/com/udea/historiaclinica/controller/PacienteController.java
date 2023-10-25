package com.udea.historiaclinica.controller;

import com.udea.historiaclinica.dto.HistoriaPacienteDTO;
import com.udea.historiaclinica.dto.PacienteDTO;
import com.udea.historiaclinica.model.HistoriaPaciente;
import com.udea.historiaclinica.model.Paciente;
import com.udea.historiaclinica.service.HistoriaPacienteService;
import com.udea.historiaclinica.service.PacienteService;
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

    //http://localhost:8080/paciente/get-paciente/22222222
    @GetMapping("/get-paciente/{cedula}")
    public ResponseEntity<PacienteDTO> findPacienteByCedula(@PathVariable String cedula){
        Paciente paciente = pacienteService.findPacienteByCedula(cedula);
        PacienteDTO pacienteDTO = new PacienteDTO();
        pacienteDTO.setCedula(paciente.getCedula());
        pacienteDTO.setNombre(paciente.getNombre());
        pacienteDTO.setApellido(paciente.getApellido());
        pacienteDTO.setCorreo(paciente.getCorreo());
        pacienteDTO.setHistoriaClinica(historiaPacienteService.findAllHistoriaPaciente(cedula));
        return ResponseEntity.ok(pacienteDTO);
    }


    @PostMapping("/guardar-historia-paciente")
    public void guardarHistoriaPaciente(@RequestBody HistoriaPacienteDTO nuevaHistoriaPacienteDTO){

        HistoriaPaciente historiaPaciente = new HistoriaPaciente();

        historiaPaciente.setCedulaPaciente(nuevaHistoriaPacienteDTO.getCedulaPaciente());
        historiaPaciente.setIdHistoriaPaciente(nuevaHistoriaPacienteDTO.getIdHistoriaPaciente());
        historiaPaciente.setCedulaDoctor(nuevaHistoriaPacienteDTO.getCedulaDoctor());
        historiaPaciente.setFecha(nuevaHistoriaPacienteDTO.getFecha());
        historiaPaciente.setValoracion(nuevaHistoriaPacienteDTO.getValoracion());

        historiaPacienteService.guardarHistoriaPaciente(historiaPaciente);
    }
}
