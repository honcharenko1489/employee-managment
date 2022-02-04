package ua.mrhoncharenko.employeemanagment.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.mrhoncharenko.employeemanagment.entity.Employee;
import ua.mrhoncharenko.employeemanagment.repository.EmployeeRepository;
import ua.mrhoncharenko.employeemanagment.service.EmployeeService;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee getEmployeeById(Long id) {
        return employeeRepository.findById(id).get();
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public void deleteEmployeeByID(Long id) {
        employeeRepository.deleteById(id);
    }


}
