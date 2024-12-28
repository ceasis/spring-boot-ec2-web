package com.apps.SpringWebEc2.controller;

import com.apps.SpringWebEc2.dto.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api/employees")
public class RestController {

    @PostMapping
    public ResponseEntity<String> createEmployee(@RequestBody EmployeeDto employeeDto) {
        // Here, you could:
        // 1. Validate the incoming data
        // 2. Save the employee data to a database
        // 3. Return an appropriate response or created resource location

        // For demonstration, just returning a success message:
        String message = String.format(
            "Employee '%s' has been created successfully!",
            employeeDto.getName()
        );

        return new ResponseEntity<>(message, HttpStatus.CREATED);
    }
}
