package com.udea.historiaclinica.dto;

public class HistoriaPacienteDTO {

    private String idHistoriaPaciente;
    private String cedulaPaciente;
    private String cedulaDoctor;
    private String fecha;
    private String valoracion;

    public HistoriaPacienteDTO() {

    }
    public String getIdHistoriaPaciente() {
        return idHistoriaPaciente;
    }
    public void setIdHistoriaPaciente(String idHistoriaPaciente) {
        this.idHistoriaPaciente = idHistoriaPaciente;
    }
    public String getCedulaPaciente() {
        return cedulaPaciente;
    }
    public void setCedulaPaciente(String cedulaPaciente) {
        this.cedulaPaciente = cedulaPaciente;
    }
    public String getCedulaDoctor() {
        return cedulaDoctor;
    }
    public void setCedulaDoctor(String cedulaDoctor) {
        this.cedulaDoctor = cedulaDoctor;
    }
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public String getValoracion() {
        return valoracion;
    }
    public void setValoracion(String valoracion) {
        this.valoracion = valoracion;
    }
}
