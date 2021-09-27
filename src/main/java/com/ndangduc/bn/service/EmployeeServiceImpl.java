package com.ndangduc.bn.service;

import com.ndangduc.bn.entity.Employee;
import com.ndangduc.bn.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployees() {
        return this.employeeRepository.findAll();
    }
}
