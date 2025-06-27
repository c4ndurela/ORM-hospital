package com.ejemplo.hospital.repository;

import com.ejemplo.hospital.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
    // acá puedo definir métodos personalizados:
    // Buscar pacientes por nombre
List<Patient> findByFirstName(String firstName);

// Buscar pacientes por apellido que contengan una palabra
List<Patient> findByLastNameContaining(String keyword);

// Buscar pacientes por edad mayor a un valor dado
List<Patient> findByAgeGreaterThan(int edad);

// Buscar por si están aceptados o no
List<Patient> findByAcceptedTrue(); // o findByAcceptedFalse()

}
