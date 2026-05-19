package com.omkar.leave_management_system.controller;

import com.omkar.leave_management_system.entity.LeaveRequest;
import com.omkar.leave_management_system.service.LeaveRequestService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/leaves")

public class LeaveRequestController {

    @Autowired
    private LeaveRequestService leaveRequestService;

    @PostMapping
    public LeaveRequest applyLeave(@RequestBody LeaveRequest leaveRequest) {
        return leaveRequestService.applyLeave(leaveRequest);
    }

    @GetMapping
    public List<LeaveRequest> getAllLeaves() {
        return leaveRequestService.getAllLeaves();
    }
    @PutMapping("/{id}")

    public LeaveRequest updateLeaveStatus(
            @PathVariable Long id,
            @RequestParam String status) {

        return leaveRequestService.updateLeaveStatus(id, status);
    }
}