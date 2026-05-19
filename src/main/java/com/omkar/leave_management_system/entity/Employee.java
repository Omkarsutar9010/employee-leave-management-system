package com.omkar.leave_management_system.entity;

import jakarta.persistence.*;
import lombok.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "employees")

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Name is required")
    private String name;

    @Email(message = "Invalid email format")
    private String email;

    @NotBlank(message = "Department is required")
    private String department;
}