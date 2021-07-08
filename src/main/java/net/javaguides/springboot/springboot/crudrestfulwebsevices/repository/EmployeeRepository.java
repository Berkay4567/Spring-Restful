package net.javaguides.springboot.springboot.crudrestfulwebsevices.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.springboot.springboot.crudrestfulwebsevices.model.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}