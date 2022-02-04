package ua.mrhoncharenko.employeemanagment.service;

import ua.mrhoncharenko.employeemanagment.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployee();

    Employee saveEmployee(Employee employee);

    Employee getEmployeeById(Long id);

    Employee updateEmployee(Employee  employee);

    void deleteEmployeeByID(Long id);
}
