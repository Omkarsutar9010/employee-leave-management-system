package com.omkar.leave_management_system.service;

import com.omkar.leave_management_system.entity.LeaveRequest;
import com.omkar.leave_management_system.repository.LeaveRequestRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class LeaveRequestService {

    @Autowired
    private LeaveRequestRepository leaveRequestRepository;

    public LeaveRequest applyLeave(LeaveRequest leaveRequest) {
        return leaveRequestRepository.save(leaveRequest);
    }

    public List<LeaveRequest> getAllLeaves() {
        return leaveRequestRepository.findAll();
    }
    public LeaveRequest updateLeaveStatus(Long id, String status) {

        LeaveRequest leaveRequest =
                leaveRequestRepository.findById(id).orElse(null);

        if (leaveRequest != null) {

            leaveRequest.setStatus(status);

            return leaveRequestRepository.save(leaveRequest);
        }

        return null;
    }
}
