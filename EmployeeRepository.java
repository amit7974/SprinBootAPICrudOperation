package coder_amit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import coder_amit.model.Employee;

public interface EmployeeRepository  extends JpaRepository<Employee, Long>{

}
