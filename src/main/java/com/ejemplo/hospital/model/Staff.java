package com.ejemplo.hospital.model;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Staff extends Person { // extendemos person, hereda todos los campos 

    @Temporal(TemporalType.DATE)
    private Date joined; // fecha en que ingresó al hospital (se guarda como DATE)

    @ElementCollection //mapear listas simples de Strings sin necesidad de crear nuevas entidades.
    private List<String> education; // lista de formaciones educativas

    @ElementCollection
    private List<String> certifications; // certificaciones que tiene ( ej. "RCP", "Emergencias")

    @ElementCollection
    private List<String> languages; // idiomas que habla
}
