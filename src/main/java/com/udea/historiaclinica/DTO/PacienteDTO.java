package com.udea.historiaclinica.DTO;

import com.udea.historiaclinica.model.HistoriaPaciente;

import java.util.List;

public class PacienteDTO {

    private String cedula;
    private String nombre;
    private String apellido;
    private String correo;
    private List<HistoriaPaciente> historiaClinica;



    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public List<HistoriaPaciente> getHistoriaClinica() {
        return historiaClinica;
    }

    public void setHistoriaClinica(List<HistoriaPaciente> historiaClinica) {
        this.historiaClinica = historiaClinica;
    }
}
