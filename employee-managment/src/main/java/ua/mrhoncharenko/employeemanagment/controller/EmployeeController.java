package ua.mrhoncharenko.employeemanagment.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import ua.mrhoncharenko.employeemanagment.entity.Employee;
import ua.mrhoncharenko.employeemanagment.service.EmployeeService;

@Controller
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public String ListEmployees(Model model) {
        model.addAttribute("employees", employeeService.getAllEmployee());
        return "employees";
    }

    @GetMapping("/employees/new")
    public String createEmployeeForm(Model model) {

        Employee employee = new Employee();
        model.addAttribute("employee", employee);
        return "create_employee";
    }

    @PostMapping("/employees")
    public String saveEmployee(@ModelAttribute("employee") Employee employee) {
        employeeService.saveEmployee(employee);
        return "redirect:/employees";
    }

    @GetMapping("/employees/edit/{id}")
    public String editEmployeeForm(@PathVariable Long id, Model model) {
        model.addAttribute("employee", employeeService.getEmployeeById(id));
        return "edit_employees";
    }

    @PostMapping("/employees/{id}")
    public String updateEmployee(@PathVariable Long id,
        @ModelAttribute("employee") Employee employee,
        Model model){
        Employee existingEmployee = employeeService.getEmployeeById(id);
        existingEmployee.setId(id);
        existingEmployee.setFirstName(employee.getFirstName());
        existingEmployee.setLastName(employee.getLastName());
        existingEmployee.setEmail(employee.getEmail());

        employeeService.updateEmployee(existingEmployee);

        return "redirect:/employees";
    }

    @GetMapping("/employees/{id}")
    public String deleteEmployee(@PathVariable Long id){
    employeeService.deleteEmployeeByID(id);
    return "redirect:/employees";
    }

}
