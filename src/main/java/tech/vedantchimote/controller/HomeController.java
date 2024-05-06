package tech.vedantchimote.controller;

import tech.vedantchimote.model.Employee;
import tech.vedantchimote.service.EmployeeService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/welcome")
@AllArgsConstructor
@Slf4j
public class HomeController {

    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> getEmployeesList() {
        log.info("Get employees list");
        return employeeService.getEmployeesList();
    }
}
