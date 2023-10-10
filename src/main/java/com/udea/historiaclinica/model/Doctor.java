package com.udea.historiaclinica.model;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="doctor")
@Data
public class Doctor {

    @Id
    @NotNull
    @Column(name="cedula")
    private String cedula;

    @NotNull
    @Column(name="nombre")
    private String nombre;

    @NotNull
    @Column(name="apellido")
    private String apellido;

    @NotNull
    @Column(name="correo")
    private String correo;

    @NotNull
    @Column(name="titulo")
    private String titulo;

    public Doctor( ) {

    }
}
