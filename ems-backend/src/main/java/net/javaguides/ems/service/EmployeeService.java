package net.javaguides.ems.service;

import net.javaguides.ems.dto.EmployeeDto;


import java.util.List;

public interface EmployeeService { //defined methods and performs business logic operations related to employee mgt
    EmployeeDto createEmployee(EmployeeDto employeeDto);

    EmployeeDto getEmployeeById(Long employeeId);

    List<EmployeeDto> getAllEmployees();

    EmployeeDto updateEmployee(Long employeeId, EmployeeDto updatedEmployee);

    void deleteEmployee(Long employeeId);
}
