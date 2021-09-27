package com.ndangduc.bn.service;

import com.ndangduc.bn.entity.Employee;
import org.springframework.stereotype.Component;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
}
