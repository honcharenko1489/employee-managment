package ua.mrhoncharenko.employeemanagment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ua.mrhoncharenko.employeemanagment.entity.Employee;
import ua.mrhoncharenko.employeemanagment.repository.EmployeeRepository;

@SpringBootApplication
public class EmployeeManagementApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(EmployeeManagementApplication.class, args);
    }

    public EmployeeManagementApplication(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }


    private final EmployeeRepository employeeRepository;

    @Override
    public void run(String... args) throws Exception {
        /*Employee  employee1 = new Employee("Serhii", "Honcharenko", "serhiiho@gmail.com");
        employeeRepository.save(employee1);
        Employee  employee2 = new Employee("Ihor", "Shepel", "elshepel@gmail.com");
        employeeRepository.save(employee2);
        Employee  employee3 = new Employee("Alexandr", "Orel", "alex@gmail.com");
        employeeRepository.save(employee3);*/

    }
}
