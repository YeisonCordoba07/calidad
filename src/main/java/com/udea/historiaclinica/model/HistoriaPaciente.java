package com.udea.historiaclinica.model;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="historia_paciente")
@Data
public class HistoriaPaciente {

    @Id
    @NotNull
    @Column(name="id_historia_paciente")
    private String idHistoriaPaciente;

    @NotNull
    @Column(name="cedula_paciente")
    private String cedulaPaciente;

    @NotNull
    @Column(name="cedula_doctor")
    private String cedulaDoctor;

    @NotNull
    @Column(name="fecha")
    private String fecha;

    @NotNull
    @Column(name="valoracion")
    private String valoracion;
    public HistoriaPaciente( ) {

    }
}
