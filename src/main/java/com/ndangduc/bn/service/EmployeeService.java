package com.ndangduc.bn.service;

import com.ndangduc.bn.entity.Employee;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    void addEmployee(Employee employee);
    Employee getEmployeeById(long id);
    void deleteEmployeeById(long id);
    Page<Employee> findPaginated(int pageNo, int PageSize);
}
