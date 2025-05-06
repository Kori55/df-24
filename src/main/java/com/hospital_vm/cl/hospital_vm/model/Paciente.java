package com.hospital_vm.cl.hospital_vm.model;

import java.sql.Date;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// agregar anotaciones que permitan interactuar con origen de datos
@Entity
@Table(name= "paciente")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(unique = true, length = 13, nullable = false)
    private String run;
    
    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String apellido;

    @Column(nullable = true)
    private Date fechaNacimiento;

    @Column(nullable = false)
    private String correo;
}
