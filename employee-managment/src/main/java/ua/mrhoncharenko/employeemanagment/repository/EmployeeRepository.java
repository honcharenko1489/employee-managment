package ua.mrhoncharenko.employeemanagment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.mrhoncharenko.employeemanagment.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
