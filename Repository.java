package com.example.employees.repository;
import com.example.employees.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class EmployeeRepository {

    private final Map<UUID, Employee> employeeStore = new HashMap<>();

    public List<Employee> findAll() {
        return new ArrayList<>(employeeStore.values());
    }

    public Optional<Employee> findByUuid(UUID uuid) {
        return Optional.ofNullable(employeeStore.get(uuid));
    }

    public Employee save(Employee employee) {
        employeeStore.put(employee.getUuid(), employee);
        return employee;
    }
}