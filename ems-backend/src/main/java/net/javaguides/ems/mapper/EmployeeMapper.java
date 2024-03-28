package net.javaguides.ems.mapper;

import net.javaguides.ems.dto.EmployeeDto;
import net.javaguides.ems.entity.Employee;

public class EmployeeMapper { //maps between Employee and EmployeeDto (Data Transfer Objects)

    public static EmployeeDto mapToEmployeeDto(Employee employee){ //takes Employee entity as an input and returns an EmployeeDto
        return new EmployeeDto( //extracts the relevant data or fields from Employee entity and uses it to construct a new EmployeeDto object
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail()
        );
    }

    public static Employee mapToEmployee(EmployeeDto employeeDto){ //same as above: vice versa
        return new Employee(
                employeeDto.getId(),
                employeeDto.getFirstName(),
                employeeDto.getLastName(),
                employeeDto.getEmail()
        );
    }
}
