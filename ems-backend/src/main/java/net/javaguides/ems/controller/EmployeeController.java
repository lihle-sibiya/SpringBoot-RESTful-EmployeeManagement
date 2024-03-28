package net.javaguides.ems.controller;

import lombok.AllArgsConstructor;

import net.javaguides.ems.dto.EmployeeDto;
import net.javaguides.ems.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*") //allows the controller to handle requests from different domains
@AllArgsConstructor
@RestController
@RequestMapping("/api/employees")//base URL
public class EmployeeController { //where we handle HTTP requests and responses

    private EmployeeService employeeService; //references EmployeeService interface - which provides methods for managing employee data

  //HTTP request handling methods:
    // Build Add Employee REST API
    @PostMapping  //Create employee
    public ResponseEntity<EmployeeDto> createEmployee(@RequestBody EmployeeDto employeeDto){//takes EmployeeDto object: representing the new employee's data as a request body
        EmployeeDto savedEmployee = employeeService.createEmployee(employeeDto);
        return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);//returns a response entity which has the new employee's data and HttpStatus code
    }

    
    // Build Get Employee REST API
    @GetMapping("{id}") //Show employee by ID
    public ResponseEntity<EmployeeDto> getEmployeeById(@PathVariable("id") Long employeeId){//take employee ID as a path variable
        EmployeeDto employeeDto = employeeService.getEmployeeById(employeeId);
        return ResponseEntity.ok(employeeDto);//returns a response entity containing the list of employees and status code OK
    }

    
    // Build Get All Employees REST API
    @GetMapping  //Show all employees
    public ResponseEntity<List<EmployeeDto>> getAllEmployees(){
        List<EmployeeDto> employees = employeeService.getAllEmployees();
        return ResponseEntity.ok(employees);
    }

    // Build Update Employee REST API
    @PutMapping("{id}") //Update employee
    public ResponseEntity<EmployeeDto> updateEmployee(@PathVariable("id") Long employeeId,//takes employee ID as a path variable
                                                      @RequestBody EmployeeDto updatedEmployee){//and the EmployeeDto: has the updated employee's data as a request body
          EmployeeDto employeeDto = employeeService.updateEmployee(employeeId, updatedEmployee);
          return ResponseEntity.ok(employeeDto);
    }

    // Build Delete Employee REST API
    @DeleteMapping("{id}") //delete employee
    public ResponseEntity<String> deleteEmployee(@PathVariable("id") Long employeeId){
        employeeService.deleteEmployee(employeeId);
        return ResponseEntity.ok("Employee deleted successfully!.");
    }
}
