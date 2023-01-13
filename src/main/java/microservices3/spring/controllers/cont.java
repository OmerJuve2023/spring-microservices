package microservices3.spring.controllers;


import microservices3.spring.model.Employee;
import microservices3.spring.repositories.EmployeeRepostiory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employees/")
public class cont {
    @Autowired
    private EmployeeRepostiory repostiory;

    @GetMapping(value = "/")
    public List<Employee> getAllEmployees() {
        return repostiory.findAll();
    }
}
