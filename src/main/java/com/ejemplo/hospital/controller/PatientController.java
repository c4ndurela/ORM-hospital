package com.ejemplo.hospital.controller;

import com.ejemplo.hospital.model.Patient;
import com.ejemplo.hospital.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/patients")
public class PatientController {

    @Autowired
    private PatientService patientService;

    // Crear nuevo paciente
    @PostMapping
    public Patient savePatient(@RequestBody Patient patient) {
        return patientService.savePatient(patient);
    }

    // Obtener todos los pacientes
    @GetMapping
    public List<Patient> getAllPatients() {
        return patientService.getAllPatients();
    }

    // Obtener paciente por ID
    @GetMapping("/{id}")
    public Optional<Patient> getPatientById(@PathVariable Long id) {
        return patientService.getPatientById(id);
    }

    // Buscar por nombre
    @GetMapping("/search/firstname")
    public List<Patient> getByFirstName(@RequestParam String name) {
        return patientService.getPatientsByFirstName(name);
    }

    // Obtener solo los aceptados
    @GetMapping("/accepted")
    public List<Patient> getAcceptedPatients() {
        return patientService.getAcceptedPatients();
    }

    // Eliminar por ID
    @DeleteMapping("/{id}")
    public void deletePatient(@PathVariable Long id) {
        patientService.deletePatient(id);
    }
}
