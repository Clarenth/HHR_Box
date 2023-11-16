package com.Teutoburg.employeemanager.repo;

import com.Teutoburg.employeemanager.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    //below is a "Query Method" used in Spring. This is structured
    //like VERB, CLASS, By FIELD: delete(ACTION)Employee(CLASS)ById(FIELD)
    void deleteEmployeeById(Long id);

    Optional<Employee> findEmployeeById(Long id);
}
