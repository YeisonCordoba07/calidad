package com.udea.historiaclinica.repository;

import com.udea.historiaclinica.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDoctorRepository extends JpaRepository<Doctor, Integer> {
    public Doctor findDoctorByCedula(String cedula);
}
