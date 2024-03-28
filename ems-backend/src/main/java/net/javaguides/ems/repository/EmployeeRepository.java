package net.javaguides.ems.repository;

import net.javaguides.ems.entity.Employee;

import org.springframework.data.jpa.repository.JpaRepository; //offers CRUD entities in JPA repository

public interface EmployeeRepository extends JpaRepository<Employee, Long> {//type of entity managed: Employee; entity primary key: Long
//provides methods for interacting with employee data in the database
}
