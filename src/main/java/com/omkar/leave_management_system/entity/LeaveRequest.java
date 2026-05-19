package com.omkar.leave_management_system.entity;

import jakarta.persistence.*;
import lombok.*;

import com.omkar.leave_management_system.entity.Employee;

@Entity
@Table(name = "leave_requests")

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class LeaveRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String leaveType;

    private String startDate;

    private String endDate;

    private String status;

    @ManyToOne
    @JoinColumn(name = "employee_id")

    private Employee employee;
}