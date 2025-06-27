package com.ejemplo.hospital.model;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Patient extends Person {

    private int age;
    private boolean accepted;

    @ElementCollection
    private List<String> allergies;

    @ElementCollection
    private List<String> prescriptions;

    private String specialReqs;
}
