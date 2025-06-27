package com.ejemplo.hospital.repository;

import com.ejemplo.hospital.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
    //  definir métodos personalizados 
}
