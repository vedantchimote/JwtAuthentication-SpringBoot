package tech.vedantchimote.service;

import tech.vedantchimote.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class EmployeeService {

    private List<Employee> empList = new ArrayList<>();

    public EmployeeService() {
        empList.add(new Employee(UUID.randomUUID().toString(), "vedant", "vedantchimote@gmail.com"));
        empList.add(new Employee(UUID.randomUUID().toString(), "karan", "karanransing@gmail.com"));
    }

    public List<Employee> getEmployeesList() {
        return empList;
    }
}
