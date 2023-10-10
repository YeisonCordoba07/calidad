package com.udea.historiaclinica.repository;

import com.udea.historiaclinica.model.HistoriaPaciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IHistoriaPaciente extends JpaRepository<HistoriaPaciente, Integer> {

    public HistoriaPaciente findHistoriaPacienteByIdHistoriaPaciente(String idHistoriaPaciente);
    public HistoriaPaciente findHistoriaPacienteByCedulaPaciente(String cedulaPaciente);
    public List<HistoriaPaciente> findAllHistoriaPacienteByCedulaPaciente(String cedulaPaciente);
}
