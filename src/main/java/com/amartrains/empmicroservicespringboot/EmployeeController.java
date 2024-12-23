package com.amartrains.empmicroservicespringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/")
public class EmployeeController {

    @GetMapping
    public String hello() {
        return "Hello new update from springboot microservice";
    }

    @PostMapping("/employees")
    public List<Employee> createEmployees() {
        return getSampleEmployees();
    }

    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        return getSampleEmployees();
    }

    private List<Employee> getSampleEmployees() {
        return Arrays.asList(
            new Employee(1, "John Doe", "Software Engineer"),
            new Employee(2, "Jane Smith", "Project Manager"),
            new Employee(3, "Emily Johnson", "QA Engineer")
        );
    }

    static class Employee {
        private int id;
        private String name;
        private String position;

        public Employee(int id, String name, String position) {
            this.id = id;
            this.name = name;
            this.position = position;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getPosition() {
            return position;
        }
    }
}